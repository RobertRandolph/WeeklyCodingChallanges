package WeeklyCodingAssignments.W10_03;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPin {
    
    public static boolean validPin(String pin) {
        // Init
        String regex = "^\\d{4}$|^\\d{6}$";
        
        // Creating pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pin);
        
        // Finding match
        return matcher.find();
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String pin = in.nextLine();
        in.close();
        
        boolean result = validPin(pin);
        System.out.println("Pin: " + pin + " Matches: " + result);
    }
}
