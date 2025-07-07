package org.example;

public class Main {
    public static void main(String[] args) {

    }


    public static boolean isPalindrome(int number){
        number = Math.abs(number);
        char[] digits = String.valueOf(number).toCharArray();
        String reversed = "";
        for(int i = digits.length-1; i>=0; i--){
            reversed += digits[i];
        }
        return reversed.equalsIgnoreCase(String.valueOf(number));
    }


    public static boolean isPerfectNumber(int number){
        if(number < 0)
            return false;

        int total = 0;
        for(int i = 1; i<= number / 2; i++){
            if(number % i == 0){
                total += i;
            }
        }

        return number == total;
    }


    public static String numberToWords(int number){
        if(number < 0)
            return "Invalid Value";

        char[] digits = String.valueOf(number).toCharArray();
        String numbersToText = "";
        for(char digit : digits){
            switch (digit){
                case '0':
                    numbersToText += "Zero ";
                    break;
                case '1':
                    numbersToText += "One ";
                    break;
                case '2':
                    numbersToText += "Two ";
                    break;
                case '3':
                    numbersToText += "Three ";
                    break;
                case '4':
                    numbersToText += "Four ";
                    break;
                case '5':
                    numbersToText += "Five ";
                    break;
                case '6':
                    numbersToText += "Six ";
                    break;
                case '7':
                    numbersToText += "Seven ";
                    break;
                case '8':
                    numbersToText += "Eight ";
                    break;
                case '9':
                    numbersToText += "Nine ";
                    break;
            }

        }
        return numbersToText.trim();
    }


}

