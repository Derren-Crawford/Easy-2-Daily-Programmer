package easy.pkg2;

/**
 *
 * @author Derren Crawford
 */

//import scanner class
import java.util.Scanner;

public class Easy2 {

    public static void main(String[] args) {
    
        int status = 1;
        
        while (status == 1)
        {
        
            System.out.println("Welcome to the SDT calculator, please make your selection");
            System.out.println("1 - Calculate speed");
            System.out.println("2 - Calculate distance");
            System.out.println("3 - Calculate time");
            System.out.println("4 - Exit system");
            
            //create scanner object
            Scanner scanIn = new Scanner(System.in);
            //run the scanner to record next input
            int input = Integer.parseInt(scanIn.nextLine());
            
            if (input == 1)
            {
                System.out.println("You have selected to calculate speed, please input the distance travelled in KM:");
                int distance = Integer.parseInt(scanIn.nextLine());
                System.out.println("Thank you, now input the time taken in minutes:");
                int time = Integer.parseInt(scanIn.nextLine());
                int timeHours = time / 60;
                int speed = distance / timeHours;
                System.out.println("Speed = Distance ÷ Time");
                System.out.println("Speed = " + distance + "KM ÷ " + timeHours + " hours");
                System.out.println("Speed = " + speed + " KM/H");
                System.out.println("Would you like to perform another operation? y/n");
                String foo = scanIn.nextLine();
                
                if (foo.equals("n"))
                {
                    status = 0;
                }
            }
            
            if (input == 2)
            {
                System.out.println("You have selected to calculate distance, please input the speed travelled in KM/H");
                int speed = Integer.parseInt(scanIn.nextLine());
                System.out.println("Thank you, now input the time taken in minutes:");
                int time = Integer.parseInt(scanIn.nextLine());
                int timeHours = time / 60;
                int distance = speed * timeHours;
                System.out.println("Distance = Speed x Time");
                System.out.println("Distance = " + speed + "KM/H x " + timeHours + " hours");
                System.out.println("Distance = " + distance + "KM");
                System.out.println("Would you like to perform another operation? y/n");
                String foo = scanIn.nextLine();
                
                if (foo.equals("n"))
                {
                    status = 0;
                }
            }
            
            if (input == 3)
            {
                System.out.println("You have selected to calculate time, please input the distance travelled in KM");
                int distance = Integer.parseInt(scanIn.nextLine());
                System.out.println("Thank you, now input the speed in KM/H");
                int speed = Integer.parseInt(scanIn.nextLine());
                int time = distance / speed;
                System.out.println("Time = Distance ÷ Speed");
                System.out.println("Time = " + distance + "KM ÷ " + speed + "KM/H");
                System.out.println("Time = " + time + " hours");
                System.out.println("Would you like to perform another operation? y/n");
                String foo = scanIn.nextLine();
                
                if (foo.equals("n"))
                {
                    status = 0;
                }
                
            }
            
        }
        
        
    }
    
}
