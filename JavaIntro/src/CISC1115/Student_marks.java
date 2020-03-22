package CISC1115;

import java.util.Scanner;

public class Student_marks {

      public static void main(String[] args) {

            int maths, physics, chemistry, english, computersc;
            double finalscore;
            boolean result;
            Scanner marks = new Scanner(System.in);

            do {
                  System.out.println("Enter marks for Maths:");
                  maths = marks.nextInt();
                  System.out.println("Enter marks for Physics:");
                  physics = marks.nextInt();
                  System.out.println("Enter marks for Chemistry:");
                  chemistry = marks.nextInt();
                  System.out.println("Enter marks for English:");
                  english = marks.nextInt();
                  System.out.println("Enter marks for Computer science:");
                  computersc = marks.nextInt();

                  finalscore = (maths + physics + chemistry + english + computersc) / 5;

                  if (finalscore > 90) {
                        System.out.println("Excellent");
                  } else if (finalscore > 80) {
                        System.out.println("very Good");
                  } else if (finalscore > 60) {
                        System.out.println("Good");
                  } else if (finalscore > 40) {
                        System.out.println("Average");
                  } else {
                        System.out.println("Poor");
                  }
                  System.out.println("Any More students?(true or false)");

                  result = marks.nextBoolean();
            } while (result);

            marks.close();
      }
}
