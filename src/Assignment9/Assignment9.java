package Assignment9;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();


//regex if sentence starts with capital letter and ends with fullstop

        Pattern regex = Pattern.compile("^[A-Z].*\\.$");

        Matcher matcher = regex.matcher(sentence);
        if (matcher.matches()) {
            System.out.println("Valid sentence");
        } else {
            System.out.println("Invalid sentence");
        }
    }
}