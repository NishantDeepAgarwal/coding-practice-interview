package codingPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayPracticeSet {

	public static void main(String[] args) {

		System.out.println("Find second highest number from given array::");
		int numbers[]=new int[] {5,9,11,2,8,21,1};
		secondHighestNumber(numbers);
		
		System.out.println("find common elements in two array");
		int art1[]= {1,2,3,4,5};
		int art2[]= {4,5,6,7,8};
		comElement(art1,art2);
		
		System.out.println("Java Program to reverse array without using another array::");
        int[] arra = { 1, 6, 9, 10, 5, 2, 7, 8, 3, 4 };
        reverseArray(arra);
		
		System.out.println("Convert List<Integer> to primitive int array::");
		List<Integer> lirr=Arrays.asList(10, 20, 30, 40, 50, 50, 10, 20 );
		listToPrimitiveInt(lirr);
		
		System.out.println("First repeating element index::"); 
	    int arrrepIndex[] = {1, 5, 3, 4, 3, 5, 6};
	    repElementIndex(arrrepIndex);
	    
	    System.out.println("print multiple missing number in array");
	    printMissingNumbers(new int[]{1, 2, 3, 4, 6, 9, 8}, 10);
	    
	    System.out.println("findNonRepeatedElement::::");
	    findNonRepeatedElement(new int[] {1, 1, 2, 2, 3, 4,9, 4, 5, 5});

	    int larr[]= {7,8,1,2,3,4,5,6};
	    leftRotation(larr,3);
	    
	    System.out.println("count occurrence of digit 4 in the whole array::");
	    int[] arrayy = new int[] {48,44,4,88,84,16,12,13};
	    countDigit4(arrayy);
		
		System.out.println("sum of all numeric values given in string array::");
		String strArrray[]= {"ab4cf","8jk97","pgr","123","6opg2","ABC"};
		sumOfNumericValueFromStringArray(strArrray);
		
		System.out.println("Sort array in 1s 0s 2s order-");
		int[] array = {0,1,0,2,2,2,1,1,0};
		sortArray0s1s2s(array);
		sortArray1s0s2s(array);
		
		// 1️- Move All Zeros to End
        int[] arr1 = {1,0,2,0,3,0,4};
        System.out.println("Move All Zeros to End-s Output: [1,2,3,4,0,0,0]");
        moveZerosToEnd(arr1);
        
        System.out.println(" Output: Array of pairs equal to target:-");
        int[] arr77 = {2,4,1,5,3,6};
        int target1=7;
        findcustomPair(arr77, target1);
        
        System.out.println(" 3-Sum Problem all pairs equal to target:-");
        int[] arr707 = {2,4,1,5,3,6};
        int target2=11;
        find3SumPair(arr707, target2);

        // 8️- Find Intersection of Two Arrays
        int[] arr8 = {1,2,2,3,4};
        int[] arr9 = {2,2,4,6};
        System.out.println("Expected Output: [2,4]");
        intersection(arr8, arr9);

        // 9️⃣ Rotate Array Right by K Steps
        int[] arr10 = {1,2,3,4,5};
        int k = 2;
        System.out.println("Expected Output: [4,5,1,2,3]");
        rotateRight(arr10, k);

        // 🔟 Find Maximum Subarray Sum
        int[] arr11 = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Expected Output: 6");
        maxSubArraySum(arr11);
        
//        Product of Array Except Self
        int[] arr = {5, 2, 3, 6};
        System.out.println("Expected output: {36,90,60,30} ");
        productArrayExceptSelf(arr);
        
        // 6️- Reverse Array
        int[] arr6 = {1,2,3,4,5};
        System.out.println("Expected Output: [5,4,3,2,1]");
        revArray1(arr6);

	}

	private static void findcustomPair(int[] arr, int target) {

//		int[] arr77 = {2,4,1,5,3,6};
//        int target=7;
		System.out.println("findcustomPair--");
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			int comp=target-arr[i];  //2,//4,//1,//5//3//6
			if(map.containsValue(comp)) {
				System.out.println(comp+":"+arr[i]);
			}
			map.put(i, arr[i]);
		}
	}

	private static void revArray1(int[] arr) {

		System.out.println("revArray1::");

		IntStream.range(0, arr.length)
		.map(i -> arr[arr.length-i-1])
		.boxed().forEach(e -> System.out.print(e +" "));
		System.out.println();
	}

	private static void productArrayExceptSelf(int[] arr) {
		// TODO Auto-generated method stub
		
	}

	private static void maxSubArraySum(int[] arr11) {
		// TODO Auto-generated method stub
		
	}

	private static void rotateRight(int[] arr10, int k) {
		// TODO Auto-generated method stub
		
	}

	private static void intersection(int[] arr8, int[] arr9) {
		// TODO Auto-generated method stub
		
	}

	private static void find3SumPair(int[] arr707, int target2) {
		// TODO Auto-generated method stub
		
	}

	private static void moveZerosToEnd(int[] arr1) {
		// TODO Auto-generated method stub
		
	}

	private static void sortArray1s0s2s(int[] array) {
		// TODO Auto-generated method stub
		
	}

	private static void sortArray0s1s2s(int[] array) {
		// TODO Auto-generated method stub
		
	}

	private static void repElementIndex(int[] arr) {

//		System.out.println("First repeating element index::");
//	    int arrrepIndex[] = {1, 5, 3, 4, 3, 5, 6};
		
		IntStream.range(0, arr.length)
		.boxed()
		.collect(Collectors.groupingBy(e -> arr[e],
				Collectors.mapping(e -> e, Collectors.toList())))
		.entrySet().stream().filter(e -> e.getValue().size()>1)
		.map(e -> e.getValue().get(0)).limit(1)
		.forEach(System.out::println);
	}

	private static void sumOfNumericValueFromStringArray(String[] strArr) {

//		String strArrray[]= {"ab4cf","8jk97","pgr","123","6opg2","ABC"};
		int sum=0;
		for(String str : strArr) {
//			int val=IntStream.range(0, str.length())
//			.filter(e -> Character.isDigit(str.charAt(e)))
//			.mapToObj(e -> Character.getNumericValue(str.charAt(e)))
//			.mapToInt(e -> e).sum();
			
			int val=str.chars().mapToObj(e -> (char)e)
			.filter(e -> Character.isDigit(e))
			.mapToInt(e -> Character.getNumericValue(e)).sum();
			sum=sum+val;
		}
		System.out.println(sum);
	}

	private static void countDigit4(int[] arr) {

//		Arrays.stream(arr).boxed()
//		int[] arrayy = new int[] {48,44,4,88,84,16,12,13};
//		int[] arr1 = new int[] {48,143};
		int count=0;
		for(int num:arr) {
			if(String.valueOf(num)
			.chars().mapToObj(e -> (char)e)
			.anyMatch(e -> e=='4')) {
				count++;
			}
				
		}
		System.out.println(count);
		String.valueOf(1484).chars().mapToObj(e -> (char)e)
		.forEach(System.out::println);
		
	}

	private static void leftRotation(int[] arr, int rot) {

//		int larr[]= {7,8,1,2,3,4,5,6}; // 2,3,4,5,6,7,8,1
		System.out.println("--leftRotation--");
		for(int i=0;i<rot;i++) {
			int temp=arr[0];
			for(int j=1;j<arr.length;j++) {
				arr[j-1]=arr[j];
			}
			arr[arr.length-1]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void findNonRepeatedElement(int[] arr) {

		List<Integer> list=Arrays.stream(arr).boxed()
		.collect(Collectors.groupingBy(e -> e, Collectors.counting()))
		.entrySet().stream().filter(e -> e.getValue()==1)
		.map(e -> e.getKey()).collect(Collectors.toList());
		
		list.stream().forEach(System.out::println);
	}

	private static void printMissingNumbers(int[] arr, int size) {

		Set<Integer> set=new HashSet<>();
		for(int num : arr) {
			set.add(num);
		}
		IntStream.rangeClosed(1, size).filter(e -> set.add(e))
		.forEach(System.out::println);
	}

	private static void listToPrimitiveInt(List<Integer> list) {

		int arr[]=list.stream().mapToInt(e -> e)
		.toArray();
		System.out.println(Arrays.toString(arr));
	}

	private static void reverseArray(int[] arr) {

		int arr1[]=IntStream.range(0, arr.length)
		.map(e -> arr[arr.length-1-e])
		.toArray();
		
//		int index=0;
//		for(int i=arr.length-1;i>=0;i--) {
//			arr[index]=arr[i];
//			index++;
//		}
		System.out.println(Arrays.toString(arr1));
	}

	private static void comElement(int[] art1, int[] art2) {
		
	}

	private static void secondHighestNumber(int[] arr) {
		
		System.out.println(Arrays.stream(arr).boxed()
		.sorted((e1,e2) -> e2-e1)
		.skip(1).limit(1).findFirst().get());
	}

}
