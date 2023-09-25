import java.util.Scanner;

public class Password_Checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Password = "Raj";
        int attempts =5;


        for (int i=1; i<=attempts; i++){
            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            if (password.equals(Password)){
                System.out.println("Login Successful!!!!!!!!!!");
                break;
            }else {
                System.out.println("Try Again!!!!!");
            }
        }
    }
}

