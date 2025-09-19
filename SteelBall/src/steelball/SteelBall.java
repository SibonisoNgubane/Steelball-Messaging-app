package steelball;

import java.util.Scanner;

public class SteelBall {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in); //Split into declaration since it was retrning errors
        Conditions login = new Conditions();

        //Register user
        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        System.out.print("Enter Phone Number:");
        String phone = input.nextLine();

        //Login
        String registrationMessage = login.registerUser(username, password, phone);
        System.out.println(registrationMessage);

        if (registrationMessage.equals("User has been registered successfully.")) {
            System.out.print("Enter username:");
            String loginUser = input.nextLine();
            System.out.print("Enter password:");
            String loginPass = input.nextLine();

            boolean loginResult = login.loginUser(loginUser, loginPass);
            System.out.println(login.returnLoginStatus(loginResult));
        }

        input.close();
    }
}