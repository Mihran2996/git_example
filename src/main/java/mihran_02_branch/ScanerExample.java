package mihran_02_branch;

import java.util.Scanner;

public class ScanerExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input name");
        String name = scanner.nextLine();
        System.out.println("Please input surname");
        String surname = scanner.nextLine();
        System.out.println("Please input age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input email");
        String email = scanner.nextLine();
        System.out.println("Please input password");
        String password = scanner.nextLine();
        System.out.println("Please input your phone number");
        String phoneNumber = scanner.nextLine();
        System.out.println("-----------------------");
    }
}
