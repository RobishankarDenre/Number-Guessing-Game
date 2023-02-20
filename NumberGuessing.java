package module_9;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {

        int randomNum = new Random().nextInt(100) + 1;

        int push = 1;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any Number between 1 to 100 : ");
            int inpNum = sc.nextInt();

            if (randomNum == inpNum) {
                System.out.println("Yes You Got It ....");
                break;
            } else if (inpNum>100){
                System.out.println("Given Input is out of Range...");
            } else if (inpNum>randomNum) {
                System.out.println("Thing something small");
            } else if (inpNum<randomNum) {
                System.out.println("Thing something Big");
            }else {
                System.out.println("Better Luck next Time...");
            }

            push +=1;
            if (push==6){
                System.out.println("Better Luck next Time...");
                break;
            }
        }
        System.out.println("The Secret Number is : "+randomNum);
    }
}
