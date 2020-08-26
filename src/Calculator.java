import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        char arth = '0'; // переменная хранящая арифметическое значение
        Scanner in = new Scanner(System.in);
        System.out.print("Input: ");
        String num = in.nextLine();
        String[] strArr = num.split(" ");
        int[] numArr = new int[strArr.length];
        if ((strArr[0].equals("I") || strArr[0].equals("II") || strArr[0].equals("III") || strArr[0].equals("IV") || strArr[0].equals("V") || strArr[0].equals("VI") || strArr[0].equals("VII") || strArr[0].equals("VIII") || strArr[0].equals("IX") || strArr[0].equals("X")) && (strArr[2].equals("I") || strArr[2].equals("II") || strArr[2].equals("III") || strArr[2].equals("IV") || strArr[2].equals("V") || strArr[2].equals("VI") || strArr[2].equals("VII") || strArr[2].equals("VIII") || strArr[2].equals("IX") || strArr[2].equals("X"))) {
            for (int o = 0; o < strArr.length;) {
                if (strArr[o].equals("/")) {
                    arth = '/';
                    o++;
                    continue;
                }
                if (strArr[o].equals("*")) {
                    arth = '*';
                    o++;
                    continue;
                }
                if (strArr[o].equals("-")) {
                    arth = '-';
                    o++;
                    continue;
                }
                if (strArr[o].equals("+")) {
                    arth = '+';
                    o++;
                    continue;
                }
                numArr[o] = RomanArabicConverter.romanToArabic(strArr[o]);
                o++;
            }
            int a = numArr[0];
            int b = numArr[2];
            int ab;
            if (arth == '/') {
                ab = a / b;
                if (ab < 0) {
                    ab = Math.abs(ab);
                    System.out.println("-" + ArabicToRoman.arabicToRoman(ab));
                } else {
                System.out.println(ArabicToRoman.arabicToRoman(ab));
                }
            }
            if (arth == '*') {
                ab = a * b;
                if (ab < 0) {
                    ab = Math.abs(ab);
                    System.out.println("-" + ArabicToRoman.arabicToRoman(ab));
                } else {
                    System.out.println(ArabicToRoman.arabicToRoman(ab));
                }
            }
            if (arth == '-') {
                ab = a - b;
                if (ab < 0) {
                    ab = Math.abs(ab);
                    System.out.println("-" + ArabicToRoman.arabicToRoman(ab));
                } else {
                    System.out.println(ArabicToRoman.arabicToRoman(ab));
                }
            }
            if (arth == '+') {
                ab = a + b;
                if (ab < 0) {
                  ab = Math.abs(ab);
                    System.out.println("-" + ArabicToRoman.arabicToRoman(ab));
                } else {
                    System.out.println(ArabicToRoman.arabicToRoman(ab));
                }
            }
        } else {
            if ((strArr[0].equals("1") || strArr[0].equals("2") || strArr[0].equals("3") || strArr[0].equals("4") || strArr[0].equals("5") || strArr[0].equals("6") || strArr[0].equals("7") || strArr[0].equals("8") || strArr[0].equals("9") || strArr[0].equals("10")) && (strArr[2].equals("1") || strArr[2].equals("2") || strArr[2].equals("3") || strArr[2].equals("4") || strArr[2].equals("5") || strArr[2].equals("6") || strArr[2].equals("7") || strArr[2].equals("8") || strArr[2].equals("9") || strArr[2].equals("10"))) {
                for (int i = 0; i < strArr.length; ) {
                    if (strArr[i].equals("/")) {
                        arth = '/';
                        i++;
                        continue;
                    }
                    if (strArr[i].equals("*")) {
                        arth = '*';
                        i++;
                        continue;
                    }
                    if (strArr[i].equals("-")) {
                        arth = '-';
                        i++;
                        continue;
                    }
                    if (strArr[i].equals("+")) {
                        arth = '+';
                        i++;
                        continue;
                    }
                    numArr[i] = Integer.parseInt(strArr[i]);
                    i++;
                }
                int c = numArr[0];
                int d = numArr[2];
                if (arth == '/') {
                    System.out.println(c / d);
                }
                if (arth == '*') {
                    System.out.println(c * d);
                }
                if (arth == '-') {
                    System.out.println(c - d);
                }
                if (arth == '+') {
                    System.out.println(c + d);
                }
            } else {
                throw new IllegalArgumentException("Wrong input");
            }
        }
    }
    }
