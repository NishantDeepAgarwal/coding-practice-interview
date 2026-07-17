package codingPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import codingPractice.Util.Employee1;

public class CodingPracticeSet {

	public static void main(String[] args) {

		List<Employee1> employees = Arrays.asList(
			    new Employee1(1, "Alice", "HR", 3000, 25, 2020),
			    new Employee1(2, "Bob", "IT", 5000, 30, 2019),
			    new Employee1(3, "Charlie", "HR", 4000, 28, 2021),
			    new Employee1(4, "David", "Finance", 6000, 35, 2020),
			    new Employee1(5, "Eve", "IT", 7000, 32, 2022)
			);
		
		String strArrray[]= {"ab4cf","8jk97","pgr","123","6opg2","ABC"};
		sumOfNumericValueFromStringArray(strArrray);
		
		int num7 = 4;
		sumOfSquares(num7); 
		System.out.println("sumOfSquares- expected Output: 30");

		String str11 = "Java Interview Prep";
		removeWhiteSpaces(str11);
		System.out.println("removeWhiteSpaces - expected Output: JavaInterviewPrep");

		int arr12[] = {1,2,3,4,5};
		rotateArrayLeft(arr12,2);
		System.out.println("rotateArrayLeft - expected Output: [3,4,5,1,2]");

		employeeCountAboveSalary(employees,4000);
		System.out.println("employeeCountAboveSalary - expected Output: 3");

		List<Integer> list2 = Arrays.asList(1,2,3,4,5);
		sumOfOddNumbers(list2);
		System.out.println("sumOfOddNumbers- expected Output: 9");

		String str12 = "Interview";
		System.out.println(reverseString(str12));
		System.out.println("reverseString - expected Output: weivretnI");

		int arr13[] = {1,2,3,1,2};
		findDuplicateElements(arr13);
		System.out.println(" findDuplicateElements - expected Output: [1,2]");

		highestSalaryByDept(employees);
		System.out.println("highestSalaryByDept- expected Output: {HR=4000, IT=7000, Finance=6000}");

		int num8 = 121;
		isPalindromeNumber(num8);
		System.out.println("isPalindromeNumber-expected Output: true");

		String str13 = "Java Spring Boot Interview";
		countWords(str13);
		System.out.println("countWords- expected Output: 4");

		int arr14[] = {1,2,3,4};
		productOfArrayExceptSelf(arr14);
		System.out.println("productOfArrayExceptSelf- expected Output: [24,12,8,6]");

		employeesByJoiningYear(employees,2020);
		System.out.println("expected Output: [Alice, David]");
		
		int num5 = 28;
		System.out.println(isPerfectNumber(num5));
		System.out.println("sum of all factors r equal- Output: true");

		String str7 = "listen";
		String str8 = "silent";
		anagramCheck(str7,str8);
		System.out.println("expected Output: true");

		int arr9[] = {0,1,0,3,12};
		moveZerosToEnd(arr9);
		System.out.println("expected Output: [1,3,12,0,0]");

		averageSalaryByDept(employees);
		System.out.println("expected Output: {HR=3500, IT=6000, Finance=6000}");

		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
		sumOfEvenNumbers(list1);
		System.out.println("expected Output: 12");

		String str9 = "hello";
		frequencyOfCharacters(str9);
		System.out.println("expected Output: {h=1,e=1,l=2,o=1}");

		int arr10[] = {2,4,11,15};
		findPairWithSum(arr10,17);
		System.out.println("expected Output: [11,4],[15,2]");

		employeeNamesSorted(employees);
		System.out.println("expected Output: [Alice,Bob,Charlie,David,Eve]");

		int num6 = 29;
		isPrime(num6);
		System.out.println("isPrime Output: true");

		String str10 = "java spring boot";
		capitalizeWords(str10);
		System.out.println("capitalizeWords Output: Java Spring Boot");

		int arr11[] = {1,2,3,4};
		arraySumExceptIndex(arr11,2);
		System.out.println("arraySumExceptIndex Output: 7");

		lowestSalaryEmployee(employees);
		System.out.println("lowestSalaryEmployee Output: Alice-HR-3000.0");
		
		int term = 6;
		fibonacciSeries(term);
		System.out.println("fibonacciSeries Output: [0,1,1,2,3,5]");

		String str4 = "educationeve";
		countVowels(str4);
		System.out.println("countVowels Output: 5");

		int arr5[] = {10,20,4,45,99};
		secondLargest(arr5);
		System.out.println("secondLargest Output: 45");

		listEmployeesByDept(employees,"IT");
		System.out.println("listEmployeesByDept Output: [Bob, Eve]");

		int num4 = 153;
		isArmstrong(num4);
		System.out.println("isArmstrong cube of all digits- Output: true");

		String str5 = "programming";
		removeDuplicates(str5);
		System.out.println("expected Output: progamin");

		int arr6[] = {1,3,5};
		int arr7[] = {2,4,6};
		mergeTwoSortedArrays(arr6,arr7);
		System.out.println("mergeTwoSortedArrays -Output: [1,2,3,4,5,6]");

		countEmployeesByDept(employees);
		System.out.println("countEmployeesByDept -Output: {HR=2, IT=2, Finance=1}");

		int a=12,b=18;
		gcd(a,b);
		System.out.println("gcd - Output: 6");

		String str6 = "Java is powerfull language";
		longestWord(str6);
		System.out.println("longestWord - Output: powerfull");

		int arr8[] = {11,42,63};
		reverseArray(arr8);
		reverseDigits(arr8);
		System.out.println("reverseArray-Output: [63,42,11]");
		System.out.println("reverseDigits-Output: [11,24,36]");

		averageAgeOfEmployees(employees);
		System.out.println("averageAgeOfEmployees-Output: 30");
		
		int arr1[] = {2,3,13,4,17};
		checkPrimeNumbers(arr1);
		System.out.println("checkPrimeNumbers - Output: true,true,false,true");

		String str1 = "programming";
		firstRepeatedCharacter(str1);
		System.out.println("firstRepeatedCharacter- Output: r");

		int arr2[] = {1,2,3,4,5};
		rightRotateArray(arr2,2);
		System.out.println("rightRotateArray - Output: [4,5,1,2,3]");

		averageSalaryOfHRDept(employees);
		System.out.println("averageSalaryOfHRDept -Output: 3500.0");

		int num1 = 1234;
		sumOfDigits(num1);
		System.out.println("sumOfDigits -Output: 10");

		String str2 = "Hello World India";
		reverseWords(str2);
		System.out.println("reverseWords -Output: India World Hello");
		
		String str14="Hello World India";
		System.out.println("reverseEachWord-olleH dlroW aidnI");
		reverseEachWord(str14);

		int arr3[] = {1,2,4,5,7,8,10};
		findMissingNumbers(arr3);
		System.out.println("findMissingNumbers -Output: 3,6,9");

		highestPaidEmployee(employees);
		System.out.println("highestPaidEmployee- Output: Eve-IT-7000.0");

		int num2 = 5;
		factorial(num2);
		System.out.println("factorial -Output: 120");

		String str3 = "madami";
		isPalindrome(str3);
		System.out.println("isPalindrome -Output: true");

		int arr4[] = {1,2,3,4};
		sumOfArray(arr4);
		System.out.println("sumOfArray -Output: 10");

		employeeCount(employees);
		System.out.println("employeeCount- Output: 5");
	}

	private static void sumOfNumericValueFromStringArray(String[] arr) {

//		strArrray[]= {"ab4cf","8jk97","pgr","123","6opg2","ABC"};
		int resp=
				Arrays.stream(arr)
				.flatMapToInt(str -> str.chars().mapToObj(e -> (char)e).mapToInt(e -> e)
						.filter(e -> Character.isDigit(e)))
				.map(e -> Character.getNumericValue(e))
//				.forEach(System.out::println);
		.sum();
		System.out.println(resp);
	}

	private static void employeeCount(List<Employee1> employees) {
		// TODO Auto-generated method stub
		
	}

	private static void sumOfArray(int[] arr4) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.stream(arr4).map(e -> e).sum());
		
	}

	private static void isPalindrome(String str3) {
		 System.out.println("check isPalindrome--------");
		System.out.println(new StringBuilder(str3).reverse().toString());
		System.out.println(str3.equals(new StringBuilder(str3).reverse().toString()));
		System.out.println("2nd way to check isPalindrome--------");
		
		System.out.println(str3.equals(str3.chars().mapToObj(e -> String.valueOf((char)e))
		.collect(Collectors.joining())));
		
		String st="";
		String revNew=IntStream.range(0, str3.length())
		.mapToObj(e -> st+str3.charAt(str3.length()-1-e))
		.collect(Collectors.joining());
		System.out.println(revNew);
		
		System.out.println("----------------------------");
		char arr[]=str3.toCharArray();
		IntStream.range(0, str3.length()/2)
		.forEach(i -> {
			char temp=arr[arr.length-i-1];
			arr[arr.length-1-i]=arr[i];
			arr[i]=temp;
		});
		System.out.println(Arrays.toString(arr));
		System.out.println("*****************************************");
		char arr1[]=str3.toCharArray();
		for(int i=0;i<arr1.length/2;i++) {
			char temp=arr1[arr1.length-i-1];
			arr1[arr1.length-1-i]=arr1[i];
			arr1[i]=temp;
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		
		String ss="";
		for(int i=0;i<str3.length();i++) {
			ss=ss+str3.charAt(str3.length()-1-i);
		}
		System.out.println(ss);
	}

	private static void factorial(int num) {

		System.out.println("factorial---");
		int fact=1;
		while(num>0) {
			fact=fact*num; //6,30,120,360,720,720
			num--;
		}
		System.out.println(fact);
	}

	private static void highestPaidEmployee(List<Employee1> employees) {
		System.out.println("highestPaidEmployee---------");
//		String empName=
//		Optional<Employee1> emp=
			Employee1 emp=	employees.stream().max((e1,e2) -> (int)(e1.salary()-e2.salary()))
		.orElse(null);
//		System.out.println(empName);
		System.out.println(emp.name()+"-"+emp.dept()+"-"+emp.salary());
	}

	private static void findMissingNumbers(int[] arr) {

//		int arr[]={1,2,4,6,7,8,10};
		Set<Integer> set=new HashSet<>();
		for(int n :arr) {
			set.add(n);
		}
		int arrMissing[]=IntStream.range(1, arr[arr.length-1])     //1,10
		.filter(e -> set.add(e))  //3,5,9
		.toArray();
		System.out.println(Arrays.toString(arrMissing));
	}

	private static void reverseEachWord(String str) {

//		String str="Hello World India";
//		Arrays.stream(str.split(" "))
		
//		for(String st: str.split(" ")) {
//			st.charAt(st.length()-1)
//		}
	}

	private static void reverseWords(String str2) {
		// TODO Auto-generated method stub
		
	}

	private static void sumOfDigits(int num1) {

		int resp=String.valueOf(num1)
		.chars().mapToObj(e -> Character.getNumericValue((char)e))
		.mapToInt(e -> e).sum();
		System.out.println("----sumOfDigits---sum is:" +resp);
	}

	private static void averageSalaryOfHRDept(List<Employee1> employees) {
		// TODO Auto-generated method stub
		
	}

	private static void rightRotateArray(int[] arr2, int i) {
		// TODO Auto-generated method stub
		
	}

	private static void firstRepeatedCharacter(String str1) {
		// TODO Auto-generated method stub
		
	}

	private static void checkPrimeNumbers(int[] arr1) {
		// TODO Auto-generated method stub
		
	}

	private static void averageAgeOfEmployees(List<Employee1> employees) {
		// TODO Auto-generated method stub
		
	}

	private static void reverseDigits(int[] arr8) {
		// TODO Auto-generated method stub
		
	}

	private static void reverseArray(int[] arr8) {
		// TODO Auto-generated method stub
		
	}

	private static void longestWord(String str) {

		String resp=
				Arrays.stream(str.split("\\s"))
				.collect(Collectors.toMap(e -> e,e -> e.length()))
				.entrySet().stream().sorted((e1,e2) -> e2.getValue()-e1.getValue())
				.map(e -> e.getKey()).findFirst().orElse("-");
				System.out.println(resp);
	}

	private static void gcd(int num1, int num2) {
		
		List<Integer> list1=
		IntStream.rangeClosed(2, num1/2)
		.filter(e -> num1%e==0)
		.mapToObj(e -> e).collect(Collectors.toList());
		
		List<Integer> list2=IntStream.rangeClosed(2, num2/2)
				.filter(e -> num2%e==0)
				.mapToObj(e -> e).collect(Collectors.toList());
		
		list1.addAll(list2);
		System.out.println(list1);
		int gcdn=list1.stream().collect(Collectors.groupingBy(e -> e,Collectors.counting()))
		.entrySet().stream().filter(e -> e.getValue()>1)
		.map(e -> e.getKey()).max((e1,e2) -> e1-e2).get();
		System.out.println("Greatest common divisor is: " +gcdn);
		
		int rgcd=IntStream.rangeClosed(2, Math.min(num1, num2))
		.filter(e -> num1%e==0 && num2%e==0)
		.max().orElse(1);
		System.out.println("2nd way of Greatest common divisor is: " +rgcd);
	}

	private static void countEmployeesByDept(List<Employee1> employees) {
		// TODO Auto-generated method stub
		
	}

	private static void mergeTwoSortedArrays(int[] arr6, int[] arr7) {
		// TODO Auto-generated method stub
		
	}

	private static void removeDuplicates(String str) {
		
		Set<String> set=new HashSet<>();
		String stnew=str.chars().mapToObj(e -> String.valueOf((char)e))
		.filter(e -> set.add(e))
		.collect(Collectors.joining());
		System.out.println(stnew);
	}

	private static void isArmstrong(int num) {
//		153
		int num1=String.valueOf(num).chars()
		.mapToObj(e -> Character.getNumericValue(e))
		.map(e -> e*e*e)
		.reduce(0,(a,b) -> a+b);
//		System.out.println(num1);
		System.out.println(String.valueOf(num).equals(String.valueOf(num1)));
	}

	private static void listEmployeesByDept(List<Employee1> employees, String string) {

		employees.stream().filter(e -> e.dept().equals(string))
		.collect(Collectors.mapping(e -> e.name(), Collectors.toList()))
		.stream().sorted().forEach(System.out::println);
	}

	private static void secondLargest(int[] arr) {

		System.out.println(Arrays.stream(arr).boxed()
		.sorted((e1,e2) -> e2-e1)
		.skip(1).findFirst().orElse(0));
	}

	private static void countVowels(String str) {

		System.out.println(str.toLowerCase().chars().mapToObj(e -> (char)e)
		.filter(e -> e=='a' || e=='e' || e=='i' || e=='o' || e=='u')
		.distinct()
		.count());
	}

	private static void fibonacciSeries(int term) {

//		0,1,1,2,3,5
		int fno=0,sno=1;
		System.out.print(fno+"-"+sno+"-");
		for(int i=2;i<term;i++) {
		int temp=fno+sno;
		fno=sno;
		sno=temp;
		System.out.print(temp+"-");
	  }
		System.out.println();
	}

	private static void lowestSalaryEmployee(List<Employee1> employees) {

		System.out.println(employees.stream().min((e1,e2) -> (int)(e1.salary()-e2.salary()))
		.get());
	}

	private static void arraySumExceptIndex(int[] arr, int index) {

		int resp=IntStream.range(0, arr.length)
		.filter(e -> e!=index).map(e -> arr[e])
		.sum();
		System.out.println(resp);
	}

	private static void capitalizeWords(String strr) {
		// expected Output: Java Spring Boot
		String stfinal="";
		for(String str :strr.split(" ")) {
			String st1=IntStream.range(0, str.length())
			.mapToObj(e -> e==0 ? String.valueOf(Character.toUpperCase(str.charAt(e))):
				String.valueOf(str.charAt(e)))
			.collect(Collectors.joining());
			 stfinal=stfinal+st1+" ";
		}
		System.out.println(stfinal);
	}

	private static void isPrime(int num) {

		System.out.println(IntStream.rangeClosed(2, num/2)
		.noneMatch(e -> num%e==0));
	}

	private static void employeeNamesSorted(List<Employee1> employees) {

		employees.stream().map(e -> e.name())
		.sorted().forEach(System.out::println);
	}

	private static void findPairWithSum(int[] arr10, int sum) {

//		int arr10[] = {2,4,11,15};
//		findPairWithSum(arr10,17);
		Map<Integer,Integer> map =new HashMap<>();
//		map.put(0, arr10[0]);
		for(int i=0;i< arr10.length;i++) {
			int temp=sum - arr10[i];
			if(map.containsKey(temp)) {
				System.out.println(temp +","+arr10[i]);
			}
		map.put(arr10[i],i);
		}
//		o/p- 2,15
//		expected Output: [11,4],[15,2]
	}

	private static void frequencyOfCharacters(String str9) {

		str9.chars().mapToObj(e -> (char)e)
		.collect(Collectors.groupingBy(e -> e,Collectors.counting()))
		.entrySet().stream().forEach(System.out::println);
	}

	private static void sumOfEvenNumbers(List<Integer> list1) {

		System.out.println(list1.stream().filter(e -> e%2==0)
		.mapToInt(e -> e).sum());
	}

	private static void averageSalaryByDept(List<Employee1> employees) {

		employees.stream()
		.collect(Collectors.groupingBy(e -> e.dept(),Collectors.averagingInt(e -> (int)e.salary())))
		.entrySet().stream().forEach(System.out::println);
	}

	private static void moveZerosToEnd(int[] arr) {

		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[index]=arr[i];
				index++;
			}
		}
		while(index<arr.length) {
			arr[index]=0;
			index++;
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void anagramCheck(String str7, String str8) {
		String st1=str7.chars().mapToObj(e -> String.valueOf((char)e))
		.sorted().collect(Collectors.joining());
		
		String st2=str8.chars().mapToObj(e -> String.valueOf((char)e))
		.sorted().collect(Collectors.joining());
//		System.out.println(st1);
//		System.out.println(st2);
		System.out.println(st1.equals(st2));
	}

	private static Boolean isPerfectNumber(int num5) {

		if(IntStream.rangeClosed(1, num5/2)
		.filter(e -> num5%e==0).map(e -> e).sum()==num5)
		    return true;
		else
			return false;
	}

	private static void employeesByJoiningYear(List<Employee1> employees, int year) {
		employees.stream().filter(e -> e.joiningYear()==year)
		.collect(Collectors.mapping(e -> e.name(), Collectors.toList()))
		.stream().forEach(System.out::println);
	}

	private static void productOfArrayExceptSelf(int[] arr) {
//      new int[]{1,2,3,4}: 24,12,8,6
		int result[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int temp=1;
			for(int j=0;j<arr.length;j++) {
				if(i!=j) {
					temp=arr[j]*temp;
				}
			}
			result[i]=temp;
		}
		System.out.println(Arrays.toString(result));
	}   
     
	private static void countWords(String str13) {

		System.out.println(Arrays.stream(str13.split(" ")).toList().size());
	}

	private static void isPalindromeNumber(int num8) {

		System.out.println(String.valueOf(num8)
				.equals(CodingPracticeSet.reverseString(String.valueOf(num8))));
	}

	private static void highestSalaryByDept(List<Employee1> employees) {

		employees.stream()
		.collect(Collectors.groupingBy(e -> e.dept()
				,Collectors.collectingAndThen(Collectors.maxBy((e1,e2)-> (int)(e1.salary()-e2.salary())), e -> e.get().salary())))
		.entrySet().stream().forEach(System.out::println);
	}

	private static void findDuplicateElements(int[] arr13) {

		Set<Integer> set=new HashSet<>();
		Arrays.stream(arr13).boxed().filter(e -> !set.add(e))
		.forEach(System.out::println);
	}

	private static String reverseString(String str12) {

		String strNew=IntStream.range(0, str12.length())
		.mapToObj(e -> str12.charAt(str12.length()-1-e))
		.map(String::valueOf).collect(Collectors.joining());
		return strNew;
	}

	private static void sumOfOddNumbers(List<Integer> list2) {

		System.out.println(list2.stream().filter(e -> e%2!=0)
		.mapToInt(e ->e).sum());
	}

	private static void employeeCountAboveSalary(List<Employee1> employees, int sal) {

		System.out.println(employees.stream().filter(e -> e.salary()>sal)
		.count());
	}

	private static void rotateArrayLeft(int[] arr, int rot) {

//		int arr12[] = {1,2,3,4,5};
		for(int i=0;i<rot;i++) {
			int temp=arr[0];
			for(int j=1;j<arr.length;j++) {
				arr[j-1]=arr[j];
			}
			arr[arr.length-1]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void removeWhiteSpaces(String str) {

		String strNew=str.chars().mapToObj(e -> (char)e)
		.filter(e -> Character.isAlphabetic(e))
		.map(String::valueOf).collect(Collectors.joining());
		System.out.println(strNew);
	}

	private static void sumOfSquares(int num) {

		System.out.println(IntStream.rangeClosed(1, num).map(e -> e*e)
		.sum());
	}

}
