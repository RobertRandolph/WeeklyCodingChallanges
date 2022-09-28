package WeeklyCodingAssignments.W9_26;

import java.util.Arrays;
import java.util.Scanner;

public class LargestGap {
    
    /**
     * Finds the largest gap between integers inside a given sorted array.
     * If the array isn't already sorted then it will be.
     * @param N The number of elements in the given array 'A'
     * @param A The array of integers
     * @return The largest gap found
     */
    public static int largestGap(int N, int[] A) {
        // Init
        int maxGap = 0;
        int gap;
        
        // Sorting array
        Arrays.sort(A);
        
        // Finding largest gap between integers in the given array
        for (int i = 0; i < N - 1; i++) {
            gap = A[i+1] - A[i];
            if (gap > maxGap) {
                maxGap = gap;
            }
        }
        
        return maxGap;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
        }
        
        in.close();
        
        int result = largestGap(N, A);
        System.out.println(result);
    }

}
