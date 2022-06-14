import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Validation v = new Validation();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first name: ");
        String f_name = sc.next();
        v.nameValidation(f_name);
        System.out.println("Please enter last name: ");
        String l_name = sc.next();
        v.nameValidation(l_name);
        System.out.println("Please enter your Email-ID: ");
        String email = sc.next();
        v.emailValidation(email);
        System.out.println("Please enter your 10 digit phone number: ");
        String phone = sc.next();
        v.phoneNumberValidation(phone);
        System.out.println("Please enter your password(it should be of minimum length 8): ");
        String password = sc.next();
        v.passwordValidation(password);
    }
}