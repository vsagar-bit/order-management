package com.ecom.ordermanagement.service;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		List<Integer> poly = getPoly("ababa");
		for (Integer i : poly) {
			System.out.print(i);
			System.out.print(" ");
		}
	}
	
	public static List<Integer> getPoly(String input) {
		List<Integer> result = new ArrayList<>();
		
		for (int i=0; i<input.length(); i++) {
			StringBuilder str = new StringBuilder(input.substring(0, i+1));
			result.add(getMaxPoli(str));
		}
		return result;
	}
	
	public static Integer getMaxPoli(StringBuilder str) {
		
		StringBuilder strorg = new StringBuilder(str);
		if (str.reverse().toString().equals(strorg.toString())) {
			return str.length();
		}
		for (int i=str.length(); i>=1; i--) {
			StringBuilder substr = new StringBuilder(strorg.substring(0, i));
			StringBuilder substrorg = new StringBuilder(substr);
			if (substr.reverse().toString().equals(substrorg.toString())) {
				return substr.length();
			}
		}
		return 0;
	}
}
