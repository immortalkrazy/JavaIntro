/**This program shows the grading of a student 
 * by taking input from the user
 * 
 */
package Do_While;

import java.util.Scanner;

/**
 * @author faisal ibrahim
 *
 */
public class Student_Marks {

      public static void main(String[] args) {

            int maths, english, chemistry, physics, computersc;
            double avgScore;
            boolean result;
            Scanner input = new Scanner(System.in);

            do {

                  System.out.println("Please eneter the marks for Maths:  ");
                  maths = input.nextInt();
                  System.out.println("Please eneter the marks for English:  ");
                  english = input.nextInt();
                  System.out.println("Please eneter the marks for Chemistry:  ");
                  chemistry = input.nextInt();
                  System.out.println("Please eneter the marks for Physics:  ");
                  physics = input.nextInt();
                  System.out.println("Please eneter the marks for ComputerSc:  ");
                  computersc = input.nextInt();

                  avgScore = (maths + english + chemistry + physics + computersc) / 5;

                  if (avgScore > 90) {
                        System.out.println("Excellent");
                  } else if (avgScore > 80) {
                        System.out.println("very Good");
                  } else if (avgScore > 70) {
                        System.out.println("Good");
                  } else if (avgScore > 60) {
                        System.out.println("Fine");
                  } else if (avgScore > 50) {
                        System.out.println("Average");
                  } else {
                        System.out.println("Poor");
                  }

                  System.out.println("Do you want to calculate more (true or false)?:  ");
                  result = input.nextBoolean();
            }

            while (result);
      }// end of main method

}// end of class
