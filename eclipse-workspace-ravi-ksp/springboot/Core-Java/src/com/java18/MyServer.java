package com.java18;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.*;
import java.net.InetSocketAddress;
import java.nio.file.*;

public class MyServer {
    public static void main(String[] args) throws IOException {
        int port = 8080;
        HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);

        // Set up handler for root path (/)
        server.createContext("/", new StaticFileHandler("public2"));

        server.setExecutor(null); // Use default executor
        server.start();

        System.out.println("Server started at http://localhost:" + port);
    }

    // Custom handler to serve static files
    static class StaticFileHandler implements HttpHandler {
        private final Path baseDir;

        public StaticFileHandler(String baseDir) {
            this.baseDir = Paths.get(baseDir).toAbsolutePath().normalize();
        }

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String path = exchange.getRequestURI().getPath();
            Path filePath = baseDir.resolve(path.substring(1)).normalize(); // Remove starting /

            if (!filePath.startsWith(baseDir) || !Files.exists(filePath)) {
                // Security check & file not found
                String error = "404 Not Found";
                exchange.sendResponseHeaders(404, error.length());
                exchange.getResponseBody().write(error.getBytes());
            } else {
                // Serve the file
                byte[] bytes = Files.readAllBytes(filePath);
                exchange.sendResponseHeaders(200, bytes.length);
                exchange.getResponseBody().write(bytes);
            }

            exchange.close();
        }
    }
}

