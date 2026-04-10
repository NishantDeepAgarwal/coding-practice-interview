package src.codingPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import codingPractice.Util.Employee1;

public class CodingPracticeSet2 {

	public static void main(String[] args) {

	    int num1 = 6;
	    factorialRecursive(num1);
	    System.out.println("factorialRecursive - expected Output: 720");

	    String str1 = "InterviewPrep";
	    removeVowels(str1);
	    System.out.println("removeVowels - expected Output: ntrvwPrp");

	    int arr1[] = {12,4,7,9};
	    secondSmallest(arr1);
	    System.out.println("secondSmallest - expected Output: 7");

	    List<Employee1> employees = Arrays.asList(
	        new Employee1(1, "Alice", "HR", 3000, 25, 2020),
	        new Employee1(2, "Bob", "IT", 5000, 30, 2019),
	        new Employee1(3, "Charlie", "HR", 4000, 28, 2021),
	        new Employee1(4, "David", "Finance", 6000, 35, 2020),
	        new Employee1(5, "Eve", "IT", 7000, 32, 2022)
	    );
	    
	    highestAgeEmployee(employees);
	    System.out.println("highestAgeEmployee - expected Output: David-35");

	    int num2 = 987;
	    sumOfDigits(num2);
	    System.out.println("sumOfDigits - expected Output: 24");

	    String str2 = "racecar";
	    isPalindrome(str2);
	    System.out.println("isPalindrome - expected Output: true");

	    int arr2[] = {1,2,3,4,5};
	    rotateArrayRight(arr2,3);
	    System.out.println("rotateArrayRight - expected Output: [3,4,5,1,2]");

	    employeesByDept(employees,"HR");
	    System.out.println("employeesByDept - expected Output: [Alice, Charlie]");

	    int num3 = 9474;
	    isArmstrong(num3);
	    System.out.println("isArmstrong - expected Output: true");

	    String str3 = "SpringBoot";
	    countConsonants(str3);
	    System.out.println("countConsonants - expected Output: 7");

	    int arr3[] = {1,2,4,5};
	    findMissingElement(arr3);
	    System.out.println("findMissingElement - expected Output: 3");

	    averageSalary(employees);
	    System.out.println("averageSalary - expected Output: 5000.0");

	    int num4 = 49;
	    isPerfectSquare(num4);
	    System.out.println("isPerfectSquare - expected Output: true");

	    String str4 = "abcabcbb";
	    longestSubstringWithoutRepeat(str4);
	    System.out.println("longestSubstringWithoutRepeat - expected Output: abc");

	    int arr4[] = {-2,1,-3,4,-1,2,1,-5,4};
	    maxSubarraySum(arr4);
	    System.out.println("maxSubarraySum - expected Output: 6");

	    employeesJoinedAfter(employees,2020);
	    System.out.println("employeesJoinedAfter - expected Output: [Charlie,Eve]");

	    int num5 = 84;
	    countPrimeFactors(num5);
	    System.out.println("countPrimeFactors - expected Output: 4");

	    stringRotation("abcd","cdab");
	    System.out.println("stringRotation - expected Output: true");

	    int arr5[] = {1,2,2,3,4,4};
	    removeDuplicates(arr5);
	    System.out.println("removeDuplicates - expected Output: [1,2,3,4]");

	    employeeNamesStartingWith(employees,"A");
	    System.out.println("employeeNamesStartingWith - expected Output: [Alice]");

	    int num6 = 10;
	    nthPrime(num6);
	    System.out.println("nthPrime - expected Output: 29");

	    capitalizeAlternate("hello world");
	    System.out.println("capitalizeAlternate - expected Output: HeLlO WoRlD");

	    intersection(new int[]{1,2,3}, new int[]{2,3,4});
	    System.out.println("intersection - expected Output: [2,3]");

	    totalSalaryByDept(employees);
	    System.out.println("totalSalaryByDept - expected Output: {HR=7000, IT=12000, Finance=6000}");

	    int num7 = 25;
	    isAutomorphic(num7);
	    System.out.println("isAutomorphic - expected Output: true");

	    frequencyOfWords("Java Java Spring");
	    System.out.println("frequencyOfWords - expected Output: {Java=2, Spring=1}");

	    union(new int[]{1,2}, new int[]{2,3});
	    System.out.println("union - expected Output: [1,2,3]");

	    youngestEmployee(employees);
	    System.out.println("youngestEmployee - expected Output: Alice-25");

	    lcm(12,18);
	    System.out.println("lcm - expected Output: 36");

	    removeDigits("abc123xyz");
	    System.out.println("removeDigits - expected Output: abcxyz");

	    int arr6[] = {5,2,9,1};
	    sortDescending(arr6);
	    System.out.println("sortDescending - expected Output: [9,5,2,1]");

	    employeesSortedBySalary(employees);
	    System.out.println("employeesSortedBySalary - expected Output: [Alice,Charlie,Bob,David,Eve]");

	    int num8 = 18;
	    isHarshadNumber(num8);
	    System.out.println("isHarshadNumber - expected Output: true");

	    firstNonRepeatedChar("swiss");
	    System.out.println("firstNonRepeatedChar - expected Output: w");

	    int arr7[] = {3,3,4,2,3};
	    findMajorityElement(arr7);
	    System.out.println("findMajorityElement - expected Output: 3");

	    employeeExists(employees,"Bob");
	    System.out.println("employeeExists - expected Output: true");

	    int num9 = 2468;
	    sumOfEvenDigits(num9);
	    System.out.println("sumOfEvenDigits - expected Output: 20");

	    checkAllUnique("abcdef");
	    System.out.println("checkAllUnique - expected Output: true");

	    int arr8[] = {2,3,4};
	    productOfArray(arr8);
	    System.out.println("productOfArray - expected Output: 24");

	    countEmployeesAboveAge(employees,30);
	    System.out.println("countEmployeesAboveAge - expected Output: 3");

	    int num10 = 12345;
	    reverseNumber(num10);
	    System.out.println("reverseNumber - expected Output: 54321");

	    reverseWords("Java Interview Prep");
	    System.out.println("reverseWords - expected Output: Prep Interview Java");

	    int arr9[] = {2,9,1,5};
	    maxDifference(arr9);
	    System.out.println("maxDifference - expected Output: 8");

	    deptWithMaxEmployees(employees);
	    System.out.println("deptWithMaxEmployees - expected Output: HR");

	    int num11 = 45;
	    isKaprekar(num11);
	    System.out.println("isKaprekar - expected Output: true");

	    isAnagram("earth","heart");
	    System.out.println("isAnagram - expected Output: true");

	    int arr10[] = {1,5,7,-1};
	    pairSumCount(arr10,6);
	    System.out.println("pairSumCount - expected Output: 2");

	    employeeNamesByYear(employees,2019);
	    System.out.println("employeeNamesByYear - expected Output: [Bob]");
	}

	private static void employeeNamesByYear(List<Employee1> employees, int year) {
		
	}

	private static void deptWithMaxEmployees(List<Employee1> employees) {
		
	}

	private static void countEmployeesAboveAge(List<Employee1> employees, int age) {
		
	}

	private static void employeeExists(List<Employee1> employees, String string) {
		
	}

	private static void employeesSortedBySalary(List<Employee1> employees) {
		
	}

	private static void youngestEmployee(List<Employee1> employees) {
		
	}

	private static void totalSalaryByDept(List<Employee1> employees) {
		
	}

	private static void employeeNamesStartingWith(List<Employee1> employees, String string) {
		
	}

	private static void employeesJoinedAfter(List<Employee1> employees, int i) {
		
	}

	private static void averageSalary(List<Employee1> employees) {
		
	}

	private static void employeesByDept(List<Employee1> employees, String string) {
		
	}

	private static void factorialRecursive(int num) {

		int fact=1;
		while(num>=1){
			fact=fact*num; //6,30,120,360,720,720
			num--;
		}
		System.out.println("fact = " + fact);
	}

	private static void removeVowels(String str1) {
		
	}

	private static void secondSmallest(int[] arr1) {
		
		System.out.println(Arrays.stream(arr1).boxed().sorted((e1,e2) -> e1-e2)
		.skip(1).findFirst().orElse(-1));
	}

	private static void highestAgeEmployee(List<Employee1> employees) {
		
	}

	private static void sumOfDigits(int num2) {
		
	}

	private static void isPalindrome(String str2) {
		
	}

	private static void rotateArrayRight(int[] arr2, int rot) {
		
	}

	private static void isArmstrong(int num3) {
		
	}

	private static void countConsonants(String str3) {
		
	}

	private static void findMissingElement(int[] arr3) {
		
	}

	private static void isPerfectSquare(int num4) {
		
	}

	private static void longestSubstringWithoutRepeat(String str4) {
		
	}

	private static void maxSubarraySum(int[] arr4) {
		
	}

	private static void countPrimeFactors(int num5) {
		
	}

	private static void stringRotation(String string, String string2) {
		
	}

	private static void removeDuplicates(int[] arr5) {
		
	}

	private static void nthPrime(int num6) {
		
	}

	private static void capitalizeAlternate(String string) {
		
	}

	private static void intersection(int[] is, int[] is2) {
		
	}

	private static void isAutomorphic(int num7) {
		
	}

	private static void frequencyOfWords(String string) {
		
	}

	private static void union(int[] is, int[] is2) {
		
	}

	private static void lcm(int i, int j) {
		
	}

	private static void removeDigits(String string) {
		
	}

	private static void sortDescending(int[] arr6) {
		
	}

	private static void isHarshadNumber(int num8) {
		
	}

	private static void firstNonRepeatedChar(String string) {
		
	}

	private static void findMajorityElement(int[] arr7) {
		
	}

	private static void sumOfEvenDigits(int num9) {
		
	}

	private static void checkAllUnique(String string) {
		
	}

	private static void productOfArray(int[] arr8) {
		
	}

	private static void reverseNumber(int num10) {
		
	}

	private static void reverseWords(String string) {
		
	}

	private static void maxDifference(int[] arr9) {
		
	}

	private static void isKaprekar(int num11) {
		
	}

	private static void isAnagram(String string, String string2) {
		
	}

	private static void pairSumCount(int[] arr10, int i) {
		
	}
}
