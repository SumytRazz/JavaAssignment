import java.util.Scanner;

public class Result_Generator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of subjects:");
        int numSub = sc.nextInt();

        double total_marks = 0;
        for (int i = 1; i <= numSub; i++) {
            System.out.println("Enter marks of Subject" + i + ":");
            int marks = sc.nextInt();
            total_marks = marks+total_marks;
        }
        double percentage = total_marks/(numSub*100)*100;

        System.out.println("Obtained Marks:"+ total_marks);
        System.out.println("Percentage obtained:"+ percentage +"%");

        if (percentage >= 90 && percentage <= 100) {
            System.out.println("Congratulations, you got A+");
        } else if (percentage >=80 && percentage < 90) {
            System.out.println("Congratulations, you got A");
        }else if (percentage >=70 && percentage < 80) {
            System.out.println("Congratulations, you got B+");
        } else if (percentage >=60 && percentage < 70) {
            System.out.println("Congratulations, you got B");
        } else if (percentage >=50 && percentage < 60) {
            System.out.println("Congratulations, you got C+");
        } else if (percentage >=40 && percentage < 50) {
            System.out.println("Congratulations, you got C");
        } else if (percentage >=35 && percentage < 40) {
            System.out.println("Congratulations, you got D");
        } else {
            System.out.println("Sorry You Failed!!!!!!!!");
        }


    }
}
