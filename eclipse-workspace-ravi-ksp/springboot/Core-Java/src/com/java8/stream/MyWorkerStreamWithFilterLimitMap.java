package com.java8.stream;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.collections.arraylistcode.MyDataBaseWorkerUtil;
import com.entity.Worker;

public class MyWorkerStreamWithFilterLimitMap {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
		List<Worker> list= MyDataBaseWorkerUtil.getListOfWorker(new ArrayList<>());
				
		
		
	    
		getWorkerIdWhoseSalaryGreaterThan3000(list);
		getWorkerNamesWhoIsAdminAndHisSalaryGreaterThan6000();
		getWorkerIdsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000();
		getWorkerIdsWithNameWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000();
		getDifferentWorkerNames(list);
		getDifferentWorkerSalaries(list);
		getThreeWorkersExperienceIsGraterthanOneYear(list);
		getFirstWorkerNameWithSalaryGreaterThan1000(list);
		getWorkerIdAndSalaryMap(list);
		GetWorkerIDAndSalarySortingBasedOnKey(list);
		getWorkerIDAndSalarySortingBasedOnValue(list);
		getWorkerNameAndSalarySortedByName(list);
		calculateWorkerExperienceBasedOnJoiningDateAndTodayDate(list);
		workerJoiningDateFormated(list);
		workerJoiningDateFormate(list);
		workerJoiningDateFormateDdMmmmYyyy(list);

	}
	
public static List<Integer> getWorkerIdWhoseSalaryGreaterThan3000(List<Worker> list) {
		
		try {
			List<Integer> listOfWorkerIds = list.stream().filter(worker -> worker.getSalary() > 3000).map(worker -> worker.getId())
					.collect(Collectors.toList());
			listOfWorkerIds.forEach(System.out::println);
			return listOfWorkerIds;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error at getWorkerIdWhoseSalaryGreaterThan3000 "+e.getMessage());
			return new ArrayList<>();
		}
	}

private static void getWorkerNamesWhoIsAdminAndHisSalaryGreaterThan6000() {
	try {
		System.out.println("getWorkerNamesWhoIsAdminAndHisSalaryGreaterThan6000 started");
		List<Worker> list = MyDataBaseWorkerUtil.getListOfWorker(new ArrayList<>());
		// if(x>10 && x%2==0) //x=20 // 2)20(10 //reminder = 0

		List<String> listOfNames = list.stream().filter(worker -> (worker.getSalary() > 6000 && worker.isAdmin()))
				.map(worker -> worker.getName()).collect(Collectors.toList());
		System.out.println("getworkerNamesWhoIsAdminAndHIsSalaryGreaterThan6000===========");
		listOfNames.forEach(System.out::println);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("error at getWorkerNamesWhoIsAdminAndHisSalaryGreaterThan6000 "+e.getMessage());
	}

}


private static void getWorkerIdsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000() {
	// TODO Auto-generated method stub
	try {
		List<Worker> list = MyDataBaseWorkerUtil.getListOfWorker(new ArrayList<>());

		List<Integer> listOfWorkerIds = list
				.stream().filter(worker -> (worker.getBloodGroup() != null
						&& "ONegative".equalsIgnoreCase(worker.getBloodGroup()) && worker.getBloodGroupPrice() < 6000))
				.map(worker -> worker.getId()).collect(Collectors.toList());
		System.out.println("getworkerIdsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000===========");
		listOfWorkerIds.forEach(System.out::println);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("error at getWorkerIdsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000 "+e.getMessage());
	}

}


private static void getWorkerIdsWithNameWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000() {
	// TODO Auto-generated method stub
	try {
		List<Worker> list = MyDataBaseWorkerUtil.getListOfWorker(new ArrayList<>());

		Map<Integer, String> listOfWorkerIdWithNames = list.stream()
				.filter(worker -> (worker.getBloodGroup() != null && "ONegative".equalsIgnoreCase(worker.getBloodGroup())
						&& worker.getBloodGroupPrice() < 6000))
				.collect(Collectors.toMap(Worker::getId, Worker::getName, (x, y) -> x + ", " + y,
						LinkedHashMap::new));

		listOfWorkerIdWithNames.forEach((key, value) -> System.out.println("id= " + key + ", name= " + value));
		listOfWorkerIdWithNames.forEach((key, value) -> System.out.println(key + ", " + value));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("error at getWorkerIdsWithNameWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000 "+e.getMessage());
	}

}
//Get different worker names?
public static List<String>  getDifferentWorkerNames(List<Worker> listOfWorkers) {
	List<String> workerNames = new ArrayList<>();
	
	try {
		List<String> listOfworkerNames =listOfWorkers.stream().map(worker -> worker.getName()).distinct()
		.collect(Collectors.toList());
		System.out.println("getDifferentEmployeeNames==========");
		listOfworkerNames.forEach(System.out::println);
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("error at getDifferentWorkerNames "+e.getMessage());
	}
	return workerNames;
	
}

//Get different worker salaries?

public static Set<Double> getDifferentWorkerSalaries(List<Worker> workerList) {
	// Declare variable outside try so it's accessible in return
    Set<Double> workerSalaries1 = new HashSet<>();
     try {
		Set<Double> workerSalaries = workerList.stream()
				 //list of worker lo nunchi each object vastundi adhi null kakunda check chestunnam
		        .filter(w -> w != null && w.getSalary() != 0)
		        .map(Worker::getSalary)
		        //set not allowed duplicate thats y .toset()
		        .collect(Collectors.toSet());
		System.out.println("=========== getDifferentWorkerSalaries==========");
		workerSalaries.forEach(System.out::println);
		
	 } catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("error at getDifferentWorkerSalaries "+e.getMessage());
	 }
	 return workerSalaries1;
}

//Get employees whose experience is > 1 year, get max 3 employees.
public static List<Worker> getThreeWorkersExperienceIsGraterthanOneYear(List<Worker> list) {
	 List<Worker> experiencedWorkers = new ArrayList<>();
	try {
		experiencedWorkers = list.stream()
		    .filter(worker -> worker.getExperience() > 1) // adjust if using different field
		    .limit(3)
		    .collect(Collectors.toList());

		System.out.println("============ Experienced workers >1 year, max 3 : ============");
		experiencedWorkers.forEach(System.out::println);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("error at getThreeWorkersExperienceIsGraterthanOneYear "+e.getMessage());
	}

    return experiencedWorkers;
}

//Get first worker name whose salary is greater than 1000?
public static String getFirstWorkerNameWithSalaryGreaterThan1000(List<Worker> workersList) {
    String workerName = "No worker found";
	try {
		workerName = workersList.stream()
		        .filter(worker -> worker != null && worker.getSalary() > 1000)
		        .map(Worker::getName)
		        .findFirst()
		        .orElse("No worker found");
		System.out.println("============ Get first worker name whose salary is greater than 1000 : ============");
		//workerName.forEach(System.out::println);
		System.out.println(workerName);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("error at getFirstWorkerNameWithSalaryGreaterThan1000 "+e.getMessage());
	}
	return workerName;
    
}
//Get workers ID and salary?

public static Map<Integer, Double> getWorkerIdAndSalaryMap(List<Worker> workersList) {
   // Map<Integer, Double> workerIdSalaryMap;
    Map<Integer, Double> workerIdSalaryMap = new HashMap<>();
	try {
		workerIdSalaryMap = workersList.stream()
		    .filter(worker -> worker != null)
		    .collect(Collectors.toMap(
		        Worker::getId,                 // key mapper: worker ID
		        Worker::getSalary,             // value mapper: worker salary
		        //explain
		        (existing, replacement) -> existing  // merge function for duplicate keys
		    ));
		System.out.println("============ Get workers ID and salary : ============");
   System.out.println(workerIdSalaryMap);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("error at getWorkerIdAndSalaryMap "+e.getMessage());
	}
    return workerIdSalaryMap;
}

//Get worker ID and salary and apply sorting based on key?
public static LinkedHashMap<Integer, Double> GetWorkerIDAndSalarySortingBasedOnKey(List<Worker> workers) {
	LinkedHashMap<Integer, Double> sorted = new LinkedHashMap<>();
	try {
		sorted = workers.stream()
		        .collect(Collectors.toMap(
		            Worker::getId,
		            Worker::getSalary,
		            (existing, duplicate) -> existing,
		            LinkedHashMap::new
		        ))
		        .entrySet().stream()
		        .sorted(Map.Entry.comparingByKey())
		        .collect(Collectors.toMap(
		            Map.Entry::getKey,
		            Map.Entry::getValue,
		            (oldValue, newValue) -> oldValue,
		            LinkedHashMap::new
		        ));
		System.out.println("============ GetWorkerIDAndSalarySortingBasedOnKey : ============");
		    sorted.forEach((id, salary) ->
		        System.out.printf("ID: %d -> Salary: %.2f%n", id, salary)
		    );
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("error at GetWorkerIDAndSalarySortingBasedOnKey "+e.getMessage());
	}

        return sorted;
    }


//Get employee ID and salary and apply sorting based on value?
public static LinkedHashMap<Integer, Double> getWorkerIDAndSalarySortingBasedOnValue(List<Worker> workers) {
 // Initialize to avoid compile error
    LinkedHashMap<Integer, Double> sortedBySalary = new LinkedHashMap<>();
	try {
		sortedBySalary = workers.stream()
		    .collect(Collectors.toMap(
		        Worker::getId,
		        Worker::getSalary,
		        (existing, duplicate) -> existing,  // handle duplicate IDs
		        LinkedHashMap::new
		    ))
		    .entrySet().stream()
		    .sorted(Map.Entry.comparingByValue())
		    .collect(Collectors.toMap(
		        Map.Entry::getKey,
		        Map.Entry::getValue,
		        (oldValue, newValue) -> oldValue,
		        LinkedHashMap::new
		    ));
		System.out.println("============ getWorkerIDAndSalarySortingBasedOnValue : ============");
		// Print entries sorted by salary
		sortedBySalary.forEach((id, salary) ->
		    System.out.printf("ID: %d -> Salary: %.2f%n", id, salary)
		);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("error at getWorkerIDAndSalarySortingBasedOnValue "+e.getMessage());
	}

    return sortedBySalary;
}

//Get Worker name and salary and apply sorting based on name?
public static LinkedHashMap<String, Double> getWorkerNameAndSalarySortedByName(List<Worker> workers) {
    LinkedHashMap<String, Double> sortedByName = new LinkedHashMap<>(); // initialize to avoid compile error
	try {
		sortedByName = workers.stream()
		    .collect(Collectors.toMap(
		        Worker::getName,
		        Worker::getSalary,
		        (existing, duplicate) -> existing,   // keep first if duplicate names
		        LinkedHashMap::new
		    ))
		    .entrySet().stream()
		    .sorted(Map.Entry.comparingByKey())  // Sort by name ascending
		    .collect(Collectors.toMap(
		        Map.Entry::getKey,
		        Map.Entry::getValue,
		        (oldValue, newValue) -> oldValue,
		        LinkedHashMap::new
		    ));
		System.out.println("============ getWorkerNameAndSalarySortedByName : ============");
		// Print each sorted entry
		sortedByName.forEach((name, salary) ->
		    System.out.printf("Name: %s -> Salary: %.2f%n", name, salary)
		);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("error at getWorkerNameAndSalarySortedByName "+e.getMessage());
	}

    return sortedByName;
}

//Calculate worker experience based on joining date and today’s date (apply Java 8 LocalDateTime)?
public static void calculateWorkerExperienceBasedOnJoiningDateAndTodayDate(List<Worker> workers) {
    try {
		LocalDate today = LocalDate.now();

		System.out.println("============ calculateWorkerExperienceBasedOnJoiningDateAndTodayDate : ============");

		workers.stream()
		    .filter(Objects::nonNull) // avoid null Worker objects
		    .forEach(w -> {
		        LocalDate join = w.getJoinDate();

		        if (join == null) {
		            System.out.printf("Worker %s (ID: %d) – no join date%n", w.getName(), w.getId());
		            return;
		        }

		        Period period = Period.between(join, today);
		        long totalDays = ChronoUnit.DAYS.between(join, today);
		        long totalMonths = ChronoUnit.MONTHS.between(join, today);
		        long totalYears = ChronoUnit.YEARS.between(join, today);

		        System.out.printf(
		            "Worker %s (ID: %d): %d years, %d months, %d days  (total %d days, %d months, %d years)%n",
		            w.getName(), w.getId(),
		            period.getYears(), period.getMonths(), period.getDays(),
		            totalDays, totalMonths, totalYears
		        );
		    });
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("error at calculateWorkerExperienceBasedOnJoiningDateAndTodayDate "+e.getMessage());
	}
}



//Get worker joining date and display in the form of 2024-06-28 06:55:234?(Suggestion: check if joining date is null using Optional)

private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
public static void workerJoiningDateFormated(List<Worker> workers) {
	try {
		System.out.println("============ workerJoiningDateFormated : ============");
workers.forEach(worker -> {
		String formatted = Optional.ofNullable(worker.getJoinDate())
		    .map(date -> date.atStartOfDay())             // convert LocalDate to LocalDateTime
		    .map(dt -> dt.format(FORMATTER))              // format with pattern
		    .orElse("no joinDate");

		System.out.printf("Worker %s (ID: %d) joined: %s%n",
		    worker.getName(), worker.getId(), formatted);
});
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("error at workerJoiningDateFormated "+e.getMessage());
	}
}

//Get employee joining date and display in the form of 2024-June-28 06:55:234
//Define formatter: full month name and milliseconds
private static final DateTimeFormatter FORMATTER1 = DateTimeFormatter.ofPattern("yyyy-MMMM-dd HH:mm:ss.SSS");
    
public static void workerJoiningDateFormate(List<Worker> workers) {
    try {
		System.out.println("==== workerJoiningDateFormateLike2024June2806:55:234 ====");

		workers.forEach(w -> {
		    String formatted = Optional.ofNullable(w.getJoinDate())
		        .map(LocalDate::atStartOfDay)         // convert LocalDate to LocalDateTime
		        .map(dt -> dt.format(FORMATTER1))      // apply pattern
		        .orElse("no joinDate");

		    System.out.printf("Worker %s (ID: %d) joined: %s%n",
		        w.getName(), w.getId(), formatted);
		});
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("error at workerJoiningDateFormateLike2024June2806 "+e.getMessage());
	}  
}


//Get employee joining date and display in the form of 28-June-2024 06:55:234
//Formatter: dd-MMMM-yyyy HH:mm:ss.SSS (day-fullMonth-year hours:minutes:seconds.millis)
private static final DateTimeFormatter FORMATTER2 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm:ss.SSS");  
    

public static void workerJoiningDateFormateDdMmmmYyyy(List<Worker> workers) {
    try {
		System.out.println("==== workerJoiningDateFormateDdMmmmYyyy ====");

		workers.forEach(w -> {
		    String formatted = Optional.ofNullable(w.getJoinDate())
		        .map(ld -> ld.atTime(LocalTime.of(6, 55, 0, 234_000_000))  // custom default time
		        )
		        .map(dt -> dt.format(FORMATTER2))
		        .orElse("no joinDate");

		    System.out.printf("Worker %s (ID: %d) joined: %s%n",
		        w.getName(), w.getId(), formatted);
		});
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("error at workerJoiningDateFormateDdMmmmYyyy "+e.getMessage());
	}
}







	    }




