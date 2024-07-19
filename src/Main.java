import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the password: ");
        int digit = input.nextInt();

        String lower_cases = "qwertyuiopasdfghjklzxcvbnm";
        String upper_cases = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String digits = "0123456789";

        String password = "";

        for(int i = 0; i < digit; i++) {
            int rand = (int)(3 * Math.random());

            switch(rand){
                case 0:
                    rand = (int)(digits.length() * Math.random());
                    password += digits.charAt(rand);
                    break;
                case 1:
                    rand = (int)(lower_cases.length() * Math.random());
                    password += lower_cases.charAt(rand);
                    break;
                case 2:
                    rand = (int)(upper_cases.length() * Math.random());
                    password += upper_cases.charAt(rand);
                    break;
            }
        }
        System.out.println("Generated password: " + password);
    }
}
