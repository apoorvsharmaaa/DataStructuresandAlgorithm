package com.company2;

public class Leetcode66 {
    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        int []a = plusOne(digits);
        for (int i = 0;i<digits.length-1;i++){
            System.out.println(plusOne(digits));
        }
//        System.out.println(a);


    }

    static int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newNumber = new int [n+1];
        newNumber[0] = 1;

        return newNumber;
    }
}
//        for (int i = 0;i< digits.length;i++){
//            System.out.println(digits[i]);
//
//        }
//    }
//}

