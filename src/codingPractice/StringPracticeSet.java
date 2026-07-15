package codingPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringPracticeSet {

	public static void main(String[] args) {

		System.out.println("How to convert duplicate characters to Uppercase in a String");
        String sttrdup = "madam sss gg fff rr malayalam";
        dupToUpperCase(sttrdup);
		
		System.out.println("check isLetter,isBlank,isCharacter");
		String sttr ="Bench";
        System.out.println(sttr.chars().allMatch(e -> Character.isLetter(e)));
        
        System.out.println("Convert FirstCharacter Of Every Word To UpperCase::");
        String strz = "this world has very good leader" + " only that they need to be identified";
		System.out.println(strz);
		convertFirstCharacter(strz);
        
		System.out.println("First letter of String only in capital::");
        String fls="nIshAnt DeeP aGarWaL";
        firstCapitalLetter(fls);
        
        System.out.println("display short form of string ::");
        String sts="nishant Deep Agarwal";
        System.out.println("expected output: - N.D.Agarwal");
        displayShortForm(sts);
		
		System.out.println("CountRepeatedWordsUsingJava8::");
        String rpstr="India is my Motherland India is Beautiful";
        countRepWords(rpstr);
		
		System.out.println("Reverse only first word of String::");
		String sd="nishant deep agarwal";
        System.out.println("input::" +sd +" output :" +"tnahsin deep agarwal");
        revfirstWord(sd);
        
        System.out.println("How do you remove a given character from String::");
		removeGivenCharacter(" JavaAa MaAnia ",'A');
		
		System.out.println("Given an array of strings, find the most frequent word in a given array,"
				+ " I mean, the string that appears the most in the array."
				+ " In the case of a tie, ​the string that is the smallest (lexicographically) ​is printed");
	    String arr[]= {"India","Love","India","Love","India","Country","Love"};
		mostFrequentWordInArray(arr);
		
        System.out.println("How to find the maximum occurring character in given String::");
        maxOccuringCharacter("Solutions");
        
        System.out.println("how to remove the duplicate word from String::");
        removeDuplicateWord("India is my loving is country");
        
        System.out.println("find n display duplicate character from string::");
        findDuplicateCharacter("programming");
        
        System.out.println("How do you check if a given string is a palindrome::");
        checkPalindrome("radar");
        
        System.out.println("String Rotation::");
        stringRotation("aflatoon","toontable");
        
        System.out.println("How do you reverse words in a given sentence without using any library method::");
        reverseString("India is my loving is country");
        
        System.out.println("How do you print the first repeated character from a string::");
        firstRepeatedCharacter("programmping");
        
        System.out.println("How do you count the occurrence of a given character in a string::");
        countOccurenceOfCharacter("programmingPg",'g');
        
        System.out.println("How do you count a number of vowels and consonants in a given string::");
        countVowelsAndConsonants("programmingtcqlodfh");
        
        System.out.println("How do you find duplicate characters in a given string::");
        findDuplicateCharacter("programmingnjdfkogr");
        
        System.out.println("How do you check if two strings are anagrams of each other::");
        checkAnagram("army","mary");
        
//        System.out.println("How do you reverse a given string in place::");
//        reverseString("program");
        
        System.out.println("string contains digits or not::");
        containDigits("abc3dritg");
        
        System.out.println("convert 3rd string letter to Uppercase::");
        convert3rdLetter("smilekoyala");
	}

	private static void convert3rdLetter(String str) {

		String neww=IntStream.range(0, str.length())
		.mapToObj(e -> e==2 ? String.valueOf(str.charAt(e)).toUpperCase() : String.valueOf(str.charAt(e)))
		.collect(Collectors.joining());
		System.out.println(neww);
	}

	private static void containDigits(String string) {

		System.out.println("containDigits::");
		boolean resp=string.chars().mapToObj(e -> (char)e)
//		.forEach(System.out::println);
		.anyMatch(e -> Character.isDigit(e));
		System.out.println(resp);
	}

	private static void checkAnagram(String string1, String string2) {

		System.out.println("---checkAnagram---");
		System.out.println(string1.chars().mapToObj(e -> String.valueOf((char)e))
				.sorted().collect(Collectors.joining()));
		System.out.println(string2.chars().mapToObj(e -> String.valueOf((char)e))
				.sorted().collect(Collectors.joining()));
		
		System.out.println(string1.chars().mapToObj(e -> String.valueOf((char)e))
		.sorted().collect(Collectors.joining())
		.equals(string2.chars().mapToObj(e -> String.valueOf((char)e))
		.sorted().collect(Collectors.joining())));
		
		System.out.println("check new switch case--");
		String day="WEDs";
		String resp=switch(day) {
		case "TUE" -> "Tuesday";
		case "WED" -> "Wednesday";
		default -> "Other Day";
		};
		System.out.println(resp);
	}

	private static void countVowelsAndConsonants(String string) {
		// TODO Auto-generated method stub
//		int vow=0,conso=0;
//		string.chars().mapToObj(e -> (char)e)
//		.forEach(e -> {
//			if(string.charAt(e)=='a' || string.charAt(e)=='e' || string.charAt(e)=='i'
//		|| string.charAt(e)=='o' || string.charAt(e)=='u')
//				vow++;
//			else
//			    conso++;
//		});
//		System.out.println(vow+"----"+conso);
		
//		IntStream.range(0, string.length())
//		.mapToObj(e -> string.charAt(e)=='a' || string.charAt(e)=='e' || string.charAt(e)=='i'
//		|| string.charAt(e)=='o' || string.charAt(e)=='u' ? vow++ : conso++);
	}

	private static void countOccurenceOfCharacter(String str, char c) {

		System.out.println("countOccurenceOfCharacter---");
		System.out.println(str.chars()
//				.mapToObj(e -> (char)e)
		.filter(ch -> ch==c).count());
		System.out.println((int)c);
		IntStream.of((int)'g').forEach(System.out::println);
		IntStream.of('f').forEach(System.out::println);
		IntStream.range('a','h').forEach(System.out::println);
	}

	private static void firstRepeatedCharacter(String str) {
//		firstRepeatedCharacter("programmping");
		char resp=str.chars().mapToObj(e -> (char)e)
		.collect(Collectors.groupingBy(e -> e,LinkedHashMap::new,Collectors.counting()))
		.entrySet().stream().filter(e -> e.getValue()>1)
		.map(e -> e.getKey()).findFirst().get();
		System.out.println(resp);
	}

	private static void reverseString(String str) {

		System.out.println("reverseString######");
		String rev="";
		System.out.println(IntStream.range(0, str.length())
		.mapToObj(e -> rev+str.charAt(str.length()-1-e))
		.collect(Collectors.joining()));
	}

	private static void stringRotation(String string1, String string2) {
		
		string1=string1+string1;
		if(string1.contains(string2))
			System.out.println("yes it is string rotation");
	}

	private static void checkPalindrome(String string) {
		// TODO Auto-generated method stub
		
	}

	private static void findDuplicateCharacter(String str) {

		
	}

	private static void removeDuplicateWord(String str) {

		String resp=Arrays.stream(str.split("\\s")).distinct()
//		.collect(Collectors.groupingBy(st -> st ,Collectors.counting()))
//		.entrySet().stream().filter(e -> e.getValue()==1).map(e -> e.getKey())
		.collect(Collectors.joining(" "));
		 System.out.println(resp);
//		 String str="India is my loving is country";
		 Stream.of(str).distinct().forEach(System.out::println);
	}

	private static void maxOccuringCharacter(String string) {
		// TODO Auto-generated method stub
		
	}

	private static void mostFrequentWordInArray(String[] arr) {

		List<String> list=Arrays.stream(arr).collect(Collectors.groupingBy(e -> e,Collectors.counting()))
		.entrySet().stream().filter(e -> e.getValue()>1)
		.map(e -> e.getKey()).collect(Collectors.toList());
		System.out.println(list);
		System.out.println(Collections.min(list));
	}

	private static void removeGivenCharacter(String string, char c) {

		String removeStr=IntStream.range(0, string.length())
		.mapToObj(e -> String.valueOf(string.charAt(e)).equals(String.valueOf(c))
				? "" : String.valueOf(string.charAt(e)))
		.collect(Collectors.joining());
		System.out.println(removeStr.trim());
	}

	private static void convertFirstCharacter(String strz) {

		String convString="";
		for(String str : strz.split(" ")) {
			convString= convString+" "+IntStream.range(0, str.length())
			.mapToObj(e -> e==0 ? String.valueOf(Character.toUpperCase(str.charAt(e))) : 
				String.valueOf(str.charAt(e)))
			.collect(Collectors.joining());
		}
		System.out.println(convString);
	}

	private static void countRepWords(String words) {

//		long cont=
				Arrays.stream(words.split(" "))
		.collect(Collectors.groupingBy(e -> e , Collectors.counting()))
		.entrySet().stream().filter(e -> e.getValue()>1)
		.map(e -> e.getKey())
//		.filter(e -> !e.equals(" "))
//		.count();
//		System.out.println(cont);
		.forEach(System.out::println);
	}

	private static void displayShortForm(String sts) {

		String str[]=sts.split(" ");
		String shortString=str[0].substring(0, 1).toUpperCase()+"."+str[1].substring(0, 1).toUpperCase()+"."
		+str[2];
		System.out.println(shortString);
	}

	private static void firstCapitalLetter(String fls) {

		String newStr="";
		for(String str : fls.split(" ")) {
			newStr=newStr+" "+IntStream.range(0, str.length())
			.mapToObj(e -> e==0 ? String.valueOf(str.charAt(e)).toUpperCase() : String.valueOf(str.charAt(e)).toLowerCase())
			.collect(Collectors.joining());
		}
		System.out.println(newStr);
	}

	private static void revfirstWord(String sd) {

		String str1[]=sd.split(" ");
		String revStr=new StringBuilder(str1[0]).reverse().toString()+" "+str1[1]+" "+str1[2];
		System.out.println(revStr);
		
		System.out.println("revfirstWord Generic way::");
		
		System.out.print(new StringBuilder(str1[0]).reverse().toString());
		IntStream.range(1, str1.length)
		.forEach(i -> System.out.print(" " +str1[i]));
		System.out.println();
	}

	private static void dupToUpperCase(String strdup) {

		Set<Character> set=new HashSet<>();
		String newStr="";
		for(String str : strdup.split(" ")) {
			char arr[]=str.toCharArray();
			newStr=newStr+" "+IntStream.range(0, arr.length)
			.mapToObj(e -> set.add(arr[e]) ? String.valueOf(arr[e]) : String.valueOf(arr[e]).toUpperCase())
			.collect(Collectors.joining());
		}
		System.out.println(newStr);
	}

}
