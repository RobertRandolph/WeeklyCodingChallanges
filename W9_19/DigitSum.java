package WeeklyCodingAssignments.W9_26;

import java.util.Scanner;

public class DigitSum {

    public static void digitSum(int T, String[] S) {
        // Init
        int sum;
        String s;

        // Going through all test cases
        for (int t = 0; t < T; t++) {
            // Init
            sum = 0;
            s = S[t];

            // Removing all non-digits
            s = s.replaceAll("[^0-9]", "");

            // Summing digits
            for (int i = 0; i < s.length(); i++) {
                sum += Character.getNumericValue(s.charAt(i));
            }

            // Printing result
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();
        String[] S = new String[T];

        for (int t = 0; t < T; t++) {
            S[t] = in.nextLine();
        }
        
        in.close();

        digitSum(T, S);
    }

}
