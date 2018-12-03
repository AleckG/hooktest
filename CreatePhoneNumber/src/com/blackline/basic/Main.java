package com.blackline.basic;

public class Main {

    public static void main(String[] args) {
	    int []numbers = new int[] {9, 3, 4, 2, 3, 1, 4, 8, 8, 0};
	    String phoneNumber = createPhoneNumber(numbers);
	    System.out.println(phoneNumber);
    }
    
    public static String createPhoneNumber(int[] numbers) {
        char[] newNumber = new char[14];
        newNumber[0] = '(';
        for(int i = 0; i < numbers.length; i++)
        {
            if (i == 2){
                newNumber[i] = ')';
                newNumber[i+1] = ' ';
            }
            if (i == 5)
                newNumber[i] = '-';
            newNumber[i] = (char)numbers[i];
        }
        return new String(newNumber);
    }
}
