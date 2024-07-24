package com.spring.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		Integer[] nmbr= {4,6,3,2,1,5,0};
		int result =3;
		Test test = new Test();
		test.getGivenRangeValue(nmbr, result);
		//System.out.println(test.getAdditionCombination(nmbr, result));
	}

	private List<int[]> getAdditionCombination(int[] nmbr, int result){
		List<int[]> resultList = new ArrayList<>();
		for(int i=0; i<nmbr.length;i++) {
			for(int j=i+1;j<nmbr.length;j++) {
				if(j!=nmbr.length && nmbr[i]+nmbr[j]==result) {
					int[] rsltArray = {nmbr[i],nmbr[j]};
					System.out.println("Result "+nmbr[i]+"  "+nmbr[j]);
					resultList.add(rsltArray);
				}
			}
			
		}
		
		return resultList;
	}
	
	private void getGivenRangeValue(Integer[] nmbr, int result) {
	List<Integer> sortedDisList = Arrays.asList(nmbr).stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
	List<Integer> sortedAscList = Arrays.asList(nmbr).stream().sorted().collect(Collectors.toList());
	System.out.println(sortedDisList);
	System.out.println("maxVal -" +sortedDisList.get(result-1));
	System.out.println("maxVal -" +sortedAscList.get(result-1));
		
	}
	

}