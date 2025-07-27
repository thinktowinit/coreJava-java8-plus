package com.entity;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * Demonstrates use of Java Streams with filtering and mapping operations on
 * Doctor entities.
 */
public class SreamsWithFilterMap {
	private static final int SALARY_DIVISOR = 3;
	private static final int MAX_DOCTORS = 3;

	
	private static final int SALARY_THRESHOLD = 3000;
	private static final String LOG_MESSAGE1 = "getDoctorIdWhoseSalaryGreaterThan3000";
	private static final int NAME_LENGTH_THRESHOLD = 6;
	private static final String LOG_MESSAGE2 = "getGenderWhoseNamesLengthGreaterThan6";
	private static final int SALARY_THRESHOLD2 = 6000;
	private static final String LOG_MESSAGE3 = "getDoctorNamesWhoAreAdminsWithSalaryAbove6000";
	private static final String TARGET_BLOOD_GROUP = "ONegative";
	private static final int BLOOD_PRICE_THRESHOLD = 6000;
	private static final String LOG_MESSAGE4 = "getDoctorIdsWithONegativeBloodGroupAndPriceBelow6000";
	static final String LOG_MESSAGE5 = "getDoctorIdsWithNamesForONegativeBloodGroupAndPriceBelow6000";

	private static final String LOG_UNIQUE_DOCTOR_NAMES = "Unique Doctor Names:";
	
	private static final java.util.function.Predicate<Doctor> VALID_NAME_CONDITION = doctor -> doctor != null
			&& doctor.getName() != null;
	private static final String LOG_NO_DOCTOR_DATA = "No doctor data available.";
	private static final String LOG_DISTINCT_SALARIES = "Distinct Doctor Salaries:";
	private static final java.util.function.Predicate<Doctor> VALID_DOCTOR = Objects::nonNull;
	private static final java.util.function.Predicate<Integer> VALID_SALARY = Objects::nonNull;
	private static final String LOG_NO_DOCTORS_AVAILABLE = "No doctors available.";
	private static final String LOG_SALARIES_INCREASED = "Salaries after increasing by 10K:";
	private static final int SALARY_INCREMENT = 10_000;
	private static final String LOG_NO_DOCTOR_DATA1 = "No doctor data available.";
	private static final String LOG_TOP3_DOCTORS = "Top 3 doctors with experience greater than 1 year:";
	private static final int EXPERIENCE_THRESHOLD = 1;
	private static final int TOP_DOCTOR_LIMIT = 3;
	private static final String LOG_DOCTOR_LIST_EMPTY = "Doctor list is empty or null.";
	private static final String LOG_FIRST_DOCTOR_SALARY_FOUND = "First doctor with salary greater than 1000: ";
	private static final String LOG_NO_DOCTOR_SALARY_FOUND = "No doctor found with salary greater than 1000.";
	private static final int SALARY_THRESHOLD_FOR_FIRST_DOCTOR = 1000;

	private static final String LOG_DOCTOR_ID_AND_SALARY = "Doctor IDs and Salaries:";
	private static final String DOCTOR_ID_PREFIX = "ID: ";
	private static final String DOCTOR_SALARY_PREFIX = ", Salary: ";

	private static final String LOG_DOCTOR_ID_SALARY_SORTED_BY_ID = "Doctor ID -> Salary (sorted by ID):";

	private static final String LOG_DOCTOR_ID_SALARY_SORTED_BY_SALARY = "Doctor ID -> Salary (sorted by Salary):";
	private static final String LOG_DOCTOR_NAME_SALARY_SORTED_BY_NAME = "Doctor Name -> Salary (sorted by Name):";
	private static final String DOCTOR_NAME_PREFIX = "Name: ";
	private static final String EXPERIENCE_LOG_PREFIX = "Doctor: ";
	private static final String EXPERIENCE_SUFFIX = " years";
	private static final String EXPERIENCE_LABEL = ", Experience: ";
	private static final String DOCTOR_LIST_EMPTY = "Doctor list is empty or null.";
	private static final String JOINING_HEADER = "Doctor: ";
	private static final String JOINING_DATE_LABEL = "Joining Date: ";

	private static final String NO_DOCTOR_DATA = "Doctor list is empty or null.";

	public static void main(String[] args) {

		List<Doctor> list = MyDataBaseDoctorUtils.getListOfDoctors(new ArrayList<>());

		task1methods(list);

		task2method(list);
	}

	private static void task2method(List<Doctor> list) {
		getUniqueDoctorNames();

		getDistinctDoctorSalaries(list);
		printSalariesIncreasedByTenK(list);
		getTop3DoctorsWithExperienceGreaterThanOne(list);
		getFirstDoctorNameWithSalaryGreaterThan1000(list);
		getDoctorIdsAndSalaries(list);
		getDoctorIdAndSalarySortedById(list);
		getDoctorIdAndSalarySortedBySalary(list);
		getDoctorNameAndSalarySortedByName(list);
		printDoctorExperience(list);
		printDoctorsJoiningDates(list);
		Doctor.printJoiningDatesWithCustomFormat();

	}

	private static void task1methods(List<Doctor> list) {
		getListOfNamesWhoseSalaryDeidedBy3AndGetMax3Doctors(list);
		getDoctorIdWhoseSalaryGreaterThan3000();
		getGenderWhoseNamesLenthGreaterThan6();
		getdoctorNamesWhoIsAdminAndHisSalaryGreaterThan6000();
		getDoctorsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000();
		getDoctorIdsWithNameWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000();
	}

	/**
	 * Returns a list of names of up to 3 doctors whose salary is divisible by 3.
	 *
	 * @param doctors the list of doctors to filter
	 * @return list of doctor names satisfying the criteria
	 */

	private static void getListOfNamesWhoseSalaryDeidedBy3AndGetMax3Doctors(List<Doctor> list) {
		try {

			System.out.println("Started processing doctor list for salary divisible by " + SALARY_DIVISOR);

			List<String> listOfEmpNames = list.stream().filter(doctor -> {
				boolean isDivisible = doctor.getSalary() % SALARY_DIVISOR == 0;
				if (isDivisible) {
					System.out
							.println("updateDoctor updatingDoctor id " + doctor.getId() + " name " + doctor.getName());
				}
				return isDivisible;
			}).limit(MAX_DOCTORS).map(emp -> emp.getName()).collect(Collectors.toList());

			listOfEmpNames.forEach(System.out::println);
			System.out.println("=============");
		} catch (Exception e) {
			System.out.println("Error occurred while processing doctors with salaries divisible by " + SALARY_DIVISOR
					+ ". Please check the input list and data integrity. Exception details: " + e.getMessage());
			e.printStackTrace();
		}

	}

	/**
	 * Prints IDs of doctors whose salary is greater than the defined salary
	 * threshold.
	 */

	private static void getDoctorIdWhoseSalaryGreaterThan3000() {
		try {
			List<Doctor> list = MyDataBaseDoctorUtils.getListOfDoctors(new ArrayList<>());

			System.out.println(LOG_MESSAGE1);
			list.stream().filter(doctor -> doctor.getSalary() > SALARY_THRESHOLD).map(Doctor::getId)
					.collect(Collectors.toList()).forEach(System.out::println);

			System.out.println("==========================");
		} catch (Exception e) {
			System.out.println("Tracking error in getDoctorIdWhoseSalaryGreaterThan3000(): " + e.getMessage());
			e.printStackTrace();
		}

	}

	/**
	 * Prints genders of doctors whose name length is greater than the defined
	 * threshold.
	 */

	private static void getGenderWhoseNamesLenthGreaterThan6() {
		try {
			List<Doctor> list = MyDataBaseDoctorUtils.getListOfDoctors(new ArrayList<>());
			List<String> listOfGenders = list.stream().filter(dtr -> dtr.getName().length() > NAME_LENGTH_THRESHOLD)
					.map(dtr -> dtr.getGender()).collect(Collectors.toList());

			System.out.println(LOG_MESSAGE2);
			listOfGenders.forEach(System.out::println);
			System.out.println("==========================");
		} catch (Exception e) {
			System.out.println("Exception occurred in getGenderWhoseNamesLenthGreaterThan6(): " + e.getMessage());
			e.printStackTrace();
		}

	}

	/**
	 * Prints names of doctors who are admins and have a salary greater than the
	 * defined threshold.
	 */

	private static void getdoctorNamesWhoIsAdminAndHisSalaryGreaterThan6000() {
		try {
			List<Doctor> list = MyDataBaseDoctorUtils.getListOfDoctors(new ArrayList<>());

			List<String> listOfNames = list.stream()
					.filter(dtr -> (dtr.getSalary() > SALARY_THRESHOLD2 && dtr.isAdmin())).map(Doctor::getName)
					.collect(Collectors.toList());

			System.out.println(LOG_MESSAGE3);
			listOfNames.forEach(System.out::println);
		} catch (Exception e) {
			System.out.println("Exception in getdoctorNamesWhoIsAdminAndHisSalaryGreaterThan6000: " + e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Prints IDs of doctors whose blood group is O-negative and blood price is
	 * below the defined threshold.
	 */

	private static void getDoctorsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000() {
		try {
			List<Doctor> list = MyDataBaseDoctorUtils.getListOfDoctors(new ArrayList<>());

			List<Integer> listOfDoctorsIds = list.stream()
					.filter(dtr -> dtr.getBloodGroup() != null
							&& TARGET_BLOOD_GROUP.equalsIgnoreCase(dtr.getBloodGroup())
							&& dtr.getBloodGroupPrice() < BLOOD_PRICE_THRESHOLD)
					.map(Doctor::getId).collect(Collectors.toList());

			System.out.println(LOG_MESSAGE4);
			listOfDoctorsIds.forEach(System.out::println);
			System.out.println("==========================");
		} catch (Exception e) {
			System.out.println("Exception occurred in getDoctorsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000: ["
					+ e.getClass().getSimpleName() + "] " + e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Prints IDs and names of doctors whose blood group is O-negative and blood
	 * price is below the defined threshold.
	 */

	private static void getDoctorIdsWithNameWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000() {
		try {
			List<Doctor> list = MyDataBaseDoctorUtils.getListOfDoctors(new ArrayList<>());

			Map<Integer, String> listOfDoctorIdWithNames = list.stream()
					.filter(dtr -> dtr.getBloodGroup() != null
							&& TARGET_BLOOD_GROUP.equalsIgnoreCase(dtr.getBloodGroup())
							&& dtr.getBloodGroupPrice() < BLOOD_PRICE_THRESHOLD)
					.collect(Collectors.toMap(Doctor::getId, Doctor::getName, (x, y) -> x + ", " + y,
							LinkedHashMap::new));

			System.out.println(LOG_MESSAGE5);

			listOfDoctorIdWithNames.forEach((key, value) -> System.out.println("id= " + key + ", name= " + value));

			System.out.println("==========================");
		} catch (Exception e) {
			System.out.println("Exception in getDoctorIdsWithNameWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000: ["
					+ e.getClass().getSimpleName() + "] " + e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Prints all unique doctor names.
	 */
	private static void getUniqueDoctorNames() {
		try {
			List<Doctor> list = MyDataBaseDoctorUtils.getListOfDoctors(new ArrayList<>());

			Set<String> uniqueDoctorNames = list.stream().filter(VALID_NAME_CONDITION).map(Doctor::getName)
					.collect(Collectors.toSet());

			System.out.println(LOG_UNIQUE_DOCTOR_NAMES);
			uniqueDoctorNames.forEach(System.out::println);
			System.out.println("==========================");

		} catch (Exception e) {
			System.out.println("Exception occurred in getUniqueDoctorNames(): [" + e.getClass().getSimpleName() + "] "
					+ e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Prints all distinct doctor salaries from the provided list.
	 *
	 * @param doctors List of Doctor objects.
	 */
	public static void getDistinctDoctorSalaries(List<Doctor> doctors) {
		try {
			Optional.ofNullable(doctors).filter(list -> !list.isEmpty()).ifPresentOrElse(list -> {
				System.out.println(LOG_DISTINCT_SALARIES);
				list.stream().filter(VALID_DOCTOR).map(Doctor::getSalary).filter(VALID_SALARY).distinct()
						.forEach(System.out::println);
				System.out.println("==========================");
			}, () -> System.out.println(LOG_NO_DOCTOR_DATA));
		} catch (Exception e) {
			System.out.println("Exception occurred in getDistinctDoctorSalaries(): [" + e.getClass().getSimpleName()
					+ "] " + e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Prints all salaries after increasing them by 10,000.
	 *
	 * @param doctors List of Doctor objects.
	 */
	public static void printSalariesIncreasedByTenK(List<Doctor> doctors) {
		try {
			Optional<List<Doctor>> optionalDoctors = Optional.ofNullable(doctors);

			if (optionalDoctors.isPresent() && !optionalDoctors.get().isEmpty()) {
				System.out.println(LOG_SALARIES_INCREASED);
				optionalDoctors.get().stream().filter(VALID_DOCTOR).map(Doctor::getSalary).filter(VALID_SALARY)
						.map(salary -> salary + SALARY_INCREMENT).forEach(System.out::println);
				System.out.println("==========================");
			} else {
				System.out.println(LOG_NO_DOCTORS_AVAILABLE);
			}

		} catch (Exception e) {
			System.out.println("Exception occurred in printSalariesIncreasedByTenK(): [" + e.getClass().getSimpleName()
					+ "] " + e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Prints top 3 doctors whose experience is greater than 1 year.
	 *
	 * @param doctors List of Doctor objects
	 */
	private static void getTop3DoctorsWithExperienceGreaterThanOne(List<Doctor> doctors) {
		try {
			Optional<List<Doctor>> optionalDoctors = Optional.ofNullable(doctors);

			if (optionalDoctors.isPresent() && !optionalDoctors.get().isEmpty()) {
				System.out.println(LOG_TOP3_DOCTORS);
				optionalDoctors.get().stream().filter(d -> d != null && d.getExperience() > EXPERIENCE_THRESHOLD)
						.limit(TOP_DOCTOR_LIMIT).forEach(d -> System.out.println("ID: " + d.getId() + ", Name: "
								+ d.getName() + ", Experience: " + d.getExperience() + " years"));
				System.out.println("==========================");
			} else {
				System.out.println(LOG_NO_DOCTOR_DATA1);
			}

		} catch (Exception e) {
			System.out.println("Exception in getTop3DoctorsWithExperienceGreaterThanOne(): ["
					+ e.getClass().getSimpleName() + "] " + e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Prints the first doctor name whose salary is greater than 1000.
	 *
	 * @param doctors List of Doctor objects
	 */
	private static void getFirstDoctorNameWithSalaryGreaterThan1000(List<Doctor> doctors) {
		try {
			Optional<List<Doctor>> optionalDoctors = Optional.ofNullable(doctors);

			if (optionalDoctors.isPresent() && !optionalDoctors.get().isEmpty()) {
				optionalDoctors.get().stream()
						.filter(d -> d != null && d.getSalary() > SALARY_THRESHOLD_FOR_FIRST_DOCTOR)
						.map(Doctor::getName).findFirst()
						.ifPresentOrElse(name -> System.out.println(LOG_FIRST_DOCTOR_SALARY_FOUND + name),
								() -> System.out.println(LOG_NO_DOCTOR_SALARY_FOUND));
				System.out.println("==========================");
			} else {
				System.out.println(LOG_DOCTOR_LIST_EMPTY);
			}

		} catch (Exception e) {
			System.out.println("Exception in getFirstDoctorNameWithSalaryGreaterThan1000(): ["
					+ e.getClass().getSimpleName() + "] " + e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Prints all doctor IDs along with their salaries.
	 *
	 * @param doctors List of Doctor objects
	 */
	private static void getDoctorIdsAndSalaries(List<Doctor> doctors) {
		try {
			Optional<List<Doctor>> optionalDoctors = Optional.ofNullable(doctors);

			if (!optionalDoctors.isPresent() || optionalDoctors.get().isEmpty()) {
				System.out.println(LOG_DOCTOR_LIST_EMPTY);
				return;
			}

			System.out.println(LOG_DOCTOR_ID_AND_SALARY);

			optionalDoctors.get().stream().filter(Objects::nonNull).forEach(doctor -> System.out
					.println(DOCTOR_ID_PREFIX + doctor.getId() + DOCTOR_SALARY_PREFIX + doctor.getSalary()));

			System.out.println("======================");
		} catch (Exception e) {
			System.out.println(
					"Exception in getDoctorIdsAndSalaries(): [" + e.getClass().getSimpleName() + "] " + e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Prints doctor IDs and their salaries sorted by ID.
	 *
	 * @param doctors List of Doctor objects
	 */
	private static void getDoctorIdAndSalarySortedById(List<Doctor> doctors) {
		try {
			Optional<List<Doctor>> optionalDoctors = Optional.ofNullable(doctors);

			if (!optionalDoctors.isPresent() || optionalDoctors.get().isEmpty()) {
				System.out.println(LOG_DOCTOR_LIST_EMPTY);
				return;
			}

			Map<Integer, Integer> doctorIdSalaryMap = optionalDoctors.get().stream().filter(Objects::nonNull).collect(
					Collectors.toMap(Doctor::getId, Doctor::getSalary, (oldValue, newValue) -> newValue, TreeMap::new));

			System.out.println(LOG_DOCTOR_ID_SALARY_SORTED_BY_ID);
			doctorIdSalaryMap
					.forEach((id, salary) -> System.out.println(DOCTOR_ID_PREFIX + id + DOCTOR_SALARY_PREFIX + salary));

			System.out.println("=========================");
		} catch (Exception e) {
			System.out.println("Exception in getDoctorIdAndSalarySortedById(): [" + e.getClass().getSimpleName() + "] "
					+ e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Prints doctor IDs and their salaries sorted by salary in ascending order.
	 *
	 * @param doctors List of Doctor objects
	 */
	private static void getDoctorIdAndSalarySortedBySalary(List<Doctor> doctors) {
		try {
			Optional<List<Doctor>> optionalDoctors = Optional.ofNullable(doctors);

			if (!optionalDoctors.isPresent() || optionalDoctors.get().isEmpty()) {
				System.out.println(LOG_DOCTOR_LIST_EMPTY);
				return;
			}

			Map<Integer, Integer> doctorIdSalaryMap = optionalDoctors.get().stream().filter(Objects::nonNull)
					.collect(Collectors.toMap(Doctor::getId, Doctor::getSalary, (oldValue, newValue) -> newValue));

			System.out.println(LOG_DOCTOR_ID_SALARY_SORTED_BY_SALARY);

			doctorIdSalaryMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(entry -> System.out
					.println(DOCTOR_ID_PREFIX + entry.getKey() + DOCTOR_SALARY_PREFIX + entry.getValue()));

			System.out.println("================================");

		} catch (Exception e) {
			System.out.println("Exception in getDoctorIdAndSalarySortedBySalary(): [" + e.getClass().getSimpleName()
					+ "] " + e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Prints doctor names and their salaries sorted alphabetically by name.
	 *
	 * @param doctors List of Doctor objects
	 */
	private static void getDoctorNameAndSalarySortedByName(List<Doctor> doctors) {
		try {
			Optional<List<Doctor>> optionalDoctors = Optional.ofNullable(doctors);

			if (!optionalDoctors.isPresent() || optionalDoctors.get().isEmpty()) {
				System.out.println(LOG_DOCTOR_LIST_EMPTY);
				return;
			}

			Map<String, Integer> doctorNameSalaryMap = optionalDoctors.get().stream().filter(Objects::nonNull)
					.filter(d -> d.getName() != null)
					.collect(Collectors.toMap(Doctor::getName, Doctor::getSalary, (oldVal, newVal) -> newVal));

			System.out.println(LOG_DOCTOR_NAME_SALARY_SORTED_BY_NAME);

			doctorNameSalaryMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(entry -> System.out
					.println(DOCTOR_NAME_PREFIX + entry.getKey() + DOCTOR_SALARY_PREFIX + entry.getValue()));

			System.out.println("====================");

		} catch (Exception e) {
			System.out.println("Exception in getDoctorNameAndSalarySortedByName(): [" + e.getClass().getSimpleName()
					+ "] " + e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Prints the experience (in years) of each doctor based on their joining date.
	 *
	 * @param doctors List of Doctor objects
	 */
	public static void printDoctorExperience(List<Doctor> doctors) {
		try {
			Optional<List<Doctor>> optionalDoctors = Optional.ofNullable(doctors);

			if (optionalDoctors.isEmpty() || optionalDoctors.get().isEmpty()) {
				System.out.println(DOCTOR_LIST_EMPTY);
				return;
			}

			optionalDoctors.get().stream().filter(Objects::nonNull).filter(d -> d.getJoiningDate() != null)
					.forEach(d -> {
						LocalDate joiningDate = d.getJoiningDate();
						LocalDate today = LocalDate.now();
						int yearsOfExperience = Period.between(joiningDate, today).getYears();

						System.out.println(EXPERIENCE_LOG_PREFIX + d.getName() + EXPERIENCE_LABEL + yearsOfExperience
								+ EXPERIENCE_SUFFIX);
					});
			System.out.println("================================");

		} catch (Exception e) {
			System.out.println(
					"Exception in printDoctorExperience(): [" + e.getClass().getSimpleName() + "] " + e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Prints each doctor's name and their formatted joining date.
	 *
	 * @param doctors list of Doctor objects
	 */
	public static void printDoctorsJoiningDates(List<Doctor> doctors) {
		try {
			Optional<List<Doctor>> optionalDoctors = Optional.ofNullable(doctors);

			if (optionalDoctors.isEmpty() || optionalDoctors.get().isEmpty()) {
				System.out.println(NO_DOCTOR_DATA);
				return;
			}

			optionalDoctors.get().stream().filter(Objects::nonNull).forEach(doctor -> {
				System.out.println(JOINING_HEADER + doctor.getName());
				System.out.println(JOINING_DATE_LABEL + doctor.getFormattedJoiningDateTime());
			});
			System.out.println("==============");

		} catch (Exception e) {
			System.out.println("Exception in printDoctorsJoiningDates(): [" + e.getClass().getSimpleName() + "] "
					+ e.getMessage());
			e.printStackTrace();
		}
	}

}
