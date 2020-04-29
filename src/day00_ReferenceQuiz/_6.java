package day00_ReferenceQuiz;
//ANSWER B
public class _6 {
    public static void addToInt(int x, int amountToAdd) {
          x = x + amountToAdd;
          }
  public static void main(String[] args) {
           int a = 15;
            int b = 10;
           _6.addToInt(a, b);
          System.out.println(a);   } }

/*
1: public class MathFunctions {
2:   public static void addToInt(int x, int amountToAdd) {
3:     x = x + amountToAdd;
4:   }
5:   public static void main(String[] args) {
6:     int a = 15;
7:     int b = 10;
8:     MathFunctions.addToInt(a, b);
9:     System.out.println(a);   } }
A. 10
B. 15
C. 25
D. Compiler error on line 3.
E. Compiler error on line 8.
F. None of the above.
 */