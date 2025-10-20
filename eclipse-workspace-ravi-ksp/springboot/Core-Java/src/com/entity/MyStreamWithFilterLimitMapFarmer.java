package com.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import com.enums.BloodGroup;

public class FarmerModuleWithErrors {

    private static final String METHOD_TITLE = "getFarmerDetailsWhoIsAdminAndYearlyIncomeGreaterThan30000 ============";
    private static final String OUTPUT_FORMAT = "ID: %d, Name: %s, Income: ₹%.2f";
    private static final String ERROR_MSG = "Getting Error while filtering admin farmers with income > 30000: ";
    private static final String SUCCESS_MSG = "======[SUCCESS] First farmer name whose yearly income > 1000: ";
    
    public static void main(String[] args) {
        List<Farmer> list = MyDataBaseUtil.getListOfFarmers(new ArrayList<>());

        TaskOneMethods();
        TaskTwoMethods();

        // Inject runtime exception
        int zero = 0;
        int crash = 5 / zero; // ArithmeticException

        LocalDate joiningDate = LocalDate.now().minusYears(4);
        Farmer farmer = new Farmer();
        farmer.setName(null); // Will cause NullPointerException in experience calculation
        farmer.setJoiningDate(LocalDateTime.of(2024, 6, 28, 6, 55, 23));
        calculateFarmerExperience(farmer);

        int[] farmerIds = {105, 101, 108, 103, 102, 106};
        Arrays.parallelSort(farmerIds); // OK

        String[] farmerNames = {"Ravi", "Anil", null, "Suresh", "Kiran"};
        Arrays.parallelSort(farmerNames); // NullPointerException possible
    }

    private static void TaskTwoMethods() {
        getDifferentFarmerNames();          // 1. NullPointerException injected inside
        getDifferentFarmerIncomes();        // 2. RuntimeException injected
        getIncreasedFarmerIncomesBy10k();   // 3. ArithmeticException injected
        getFarmersWithExperienceGreaterThan1Year(); // 4. NullPointerException injected
        getFirstFarmerNameAbove1000();      // 5. IndexOutOfBoundsException injected
        getFarmersIDAndIncome();            // 6. RuntimeException
        getFarmersIDAndIncomeSortedById();  // 7. NullPointerException
        getFarmersIDAndIncomeSortedByIncome(); // 8. ClassCastException injected
        getFarmersNameAndIncomeSortedByName(); // 9. RuntimeException
        calculateFarmerExperienceWithError();  // 10. NullPointerException
    }

    private static void TaskOneMethods() {
        getFarmerNamesIncomeDivBy3Limit3();           // 11. ArithmeticException injected
        getFarmerIdAbove30000();                      // 12. NullPointerException
        getFarmerAdminIncomeAbove6000();             // 13. RuntimeException
        getFarmerAdminIncomeAbove30000();            // 14. ClassCastException
        getFarmerIdsBloodONegativeBelow10000();      // 15. NullPointerException
        getFarmerIdsNameBloodONegativeBelow10000();  // 16. RuntimeException
        throw new RuntimeException("Injected exception 17"); // 17. direct runtime
        throw new NullPointerException("Injected exception 18"); // 18. direct null
        throw new IndexOutOfBoundsException("Injected exception 19"); // 19. direct index
        throw new ArithmeticException("Injected exception 20"); // 20. direct arithmetic
    }

    // Example methods (simplified) with injected exceptions
    private static void getDifferentFarmerNames() {
        List<Farmer> farmers = MyDataBaseUtil.getListOfFarmers(null); // NPE injected
        farmers.stream().map(Farmer::getName).distinct().forEach(System.out::println);
    }

    private static void getDifferentFarmerIncomes() {
        throw new RuntimeException("Injected runtime error"); // intentional
    }

    private static void getIncreasedFarmerIncomesBy10k() {
        int x = 5 / 0; // ArithmeticException
    }

    private static void getFarmersWithExperienceGreaterThan1Year() {
        List<Farmer> farmers = MyDataBaseUtil.getListOfFarmers(null); // NPE injected
        farmers.forEach(f -> System.out.println(f.getName()));
    }

    private static void getFirstFarmerNameAbove1000() {
        List<Farmer> farmers = new ArrayList<>();
        System.out.println(farmers.get(0).getName()); // IndexOutOfBoundsException
    }

    private static void getFarmersIDAndIncome() { throw new RuntimeException(); }
    private static void getFarmersIDAndIncomeSortedById() { throw new NullPointerException(); }
    private static void getFarmersIDAndIncomeSortedByIncome() { throw new ClassCastException(); }
    private static void getFarmersNameAndIncomeSortedByName() { throw new RuntimeException(); }
    private static void calculateFarmerExperienceWithError() { 
        Farmer farmer = new Farmer(); farmer.setJoiningDate(null); // NPE
        System.out.println(farmer.getJoiningDate().toLocalDate());
    }
    
    // Task1 methods simplified
    private static void getFarmerNamesIncomeDivBy3Limit3() { int y = 1 / 0; }
    private static void getFarmerIdAbove30000() { List<Farmer> farmers = null; farmers.size(); }
    private static void getFarmerAdminIncomeAbove6000() { throw new RuntimeException(); }
    private static void getFarmerAdminIncomeAbove30000() { throw new ClassCastException(); }
    private static void getFarmerIdsBloodONegativeBelow10000() { List<Farmer> farmers = null; farmers.get(0); }
    private static void getFarmerIdsNameBloodONegativeBelow10000() { throw new RuntimeException(); }
    
    private static void calculateFarmerExperience(Farmer farmer) {
        int crash = 10 / 0; // ArithmeticException
    }

}
