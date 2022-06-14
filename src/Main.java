import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Validation v = new Validation();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first name");
        String f_name = sc.next();
        v.nameValidation(f_name);
        System.out.println("Please enter last name");
        String l_name = sc.next();
        v.nameValidation(l_name);

    }
}