package WeeklyCodingAssignments.W9_26;

import java.util.Scanner;

public class SecondLargest {
    
    public static void secondLargest(int Q, int[][] A) {
        // Init
        int[] a;
        
        // Going through all queries
        for (int q = 0; q < Q; q++) {
            a = A[q];
            
            // Finding 2nd largest num
            if ((a[0] < a[1] && a[1] < a[2]) || (a[0] > a[1] && a[1] > a[2])) {
                System.out.println(a[1]);
            }
            else if ((a[1] < a[0] && a[0] < a[2]) || (a[1] > a[0] && a[0] > a[2])) {
                System.out.println(a[0]);
            }
            else {
                System.out.println(a[2]);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int Q = in.nextInt();
        int[][] A = new int[Q][3];
        
        for (int q = 0; q < Q; q++) {
            A[q][0] = in.nextInt();
            A[q][1] = in.nextInt();
            A[q][2] = in.nextInt();
        }
        
        in.close();
        
        secondLargest(Q, A);
    }

}
