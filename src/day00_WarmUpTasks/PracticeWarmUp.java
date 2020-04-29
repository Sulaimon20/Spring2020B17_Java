package day00_WarmUpTasks;

public class PracticeWarmUp {
      /*    A triangle is valid if the sum of all the three angles is equal to 180 degrees.
    Write a program that declares three integers as angles and check whether
    a triangle is valid or not.     */
      public static void main(String[] args) {
          int a=90;
          int b=46;
          int c=45;
          if (a+b+c == 180) {
              System.out.println("The triangle is valid");
              }
          if (a+b+c > 180 || a+b+c < 180){
              System.out.println("The triangle is not valid");
          }
      }
}
