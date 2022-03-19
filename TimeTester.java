
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Khushdeep singh
 */
public class TimeTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number of seconds you want to convert: \n");
        int totalSeconds;
        totalSeconds = input.nextInt();

        Time answer;
        answer = new Time(totalSeconds);

        System.out.println("You have entered " + totalSeconds + " seconds which is equivalent to \n" + answer.getNumberOfHours() + " hour(s)," + answer.getNumberOfMinutes() + " minute(s), and " + answer.getNumberOfSeconds() + " second(s)");
        // TODO code application logic here

    }

}
