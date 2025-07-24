package com.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyParallelSort {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(90);
        list.add(5);
        list.add(300);
        list.add(15);
        list.add(80);
        list.add(1);

        // Convert list to array
        Integer[] array = list.toArray(new Integer[0]);

        // Parallel sort (ascending order)
        Arrays.parallelSort(array);

        // Convert array back to list
        List<Integer> sortedList = Arrays.asList(array);

        // Print sorted values
        sortedList.forEach(System.out::println);
    }
}
