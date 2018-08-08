package com.dlh.zambas.test;

public class BinaryString {
	public static void main(String[] args) {
		String s = "0?1?";
		generateAllBinaryString(s.toCharArray(),0);
	}

	
	private static void generateAllBinaryString(char[] charArray, int index) {
		if(charArray.length == index){
			System.out.println(charArray);
			return;
		}
		
		if(charArray[index] == '?'){
			charArray[index] = '0';
			generateAllBinaryString(charArray, index+1);
			
			charArray[index] = '1';
			generateAllBinaryString(charArray, index+1);
			
			System.out.println("*** ");
			charArray[index] = '?';
		}else{
			generateAllBinaryString(charArray, index+1);
		}
	}
}
