package com.spring.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example {
	public static void main(String[] args) {
		String s="i love my country india and India is my country India";
        List<String> strList = Arrays.asList(s.split(" "));
		
		  Map<String,Integer> resultMap = new HashMap<>(); 
		  
		  
			/*
			 * for (String word : strList) { // Increment the count for the word in the map
			 * resultMap.put(word, resultMap.getOrDefault(word, 0) + 1); }
			 * System.out.println(resultMap);
			 */
		  for(int i=0;i<strList.size();i++) {
			  int count=1;
			  for (int j=i+1;j<strList.size();j++) {
				  if(strList.get(i).equals(strList.get(j))) {
					  count++;
				  }
			  }
			  if(resultMap.get(strList.get(i))==null) {
			  resultMap.put(strList.get(i), count);
			  }
		  }
		  System.out.println(resultMap);
		//System.out.println(strList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
		  String sName = "siva naganjnaeyulu";
		  System.out.println(Arrays.asList(sName.split("")).stream().collect(Collectors.groupingBy(String::trim,TreeMap::new,Collectors.counting())));
		  
	}

}
