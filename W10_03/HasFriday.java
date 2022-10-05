package WeeklyCodingAssignments.W10_03;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class HasFriday {
    
    public static boolean hasFriday(int month, int year) {
        // Input Validation
        if (month < 0 || month > 12 || year < 0) {
            return false;
        }
        
        // Init
        LocalDate date = LocalDate.of(year, month, 13);
        
        // Checking if month has Friday 13th
        return date.getDayOfWeek() == DayOfWeek.FRIDAY;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int year = in.nextInt();
        in.close();
        
        boolean result = hasFriday(month, year);
        System.out.println(month + "/" + year + " has friday: " + result);
    }

}
