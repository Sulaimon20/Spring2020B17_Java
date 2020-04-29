package day00_ReferenceQuiz;
// ANSWER C
public class _4 {
public static void main(String[] args) {
          boolean keepGoing = true;
           int count = 0;
          int x = 3;
           while(count++ < 3) {
                int y = (1 + 2 * count) % 3;
                 switch(y) {
                       default:
                          case 0: x -= 1; break;
                        case 1: x += 5;
                         }
              }
        System.out.println(x);
      } }

/*

What is the output of the following program?
1: public class FeedingSchedule {
2:  public static void main(String[] args) {
3:    boolean keepGoing = true;
4:    int count = 0;
5:    int x = 3;
6:    while(count++ < 3) {
7:      int y = (1 + 2 * count) % 3;
8:      switch(y) {
9:         default:
10:         case 0: x -= 1; break;
11:         case 1: x += 5;
12:      }
13:    }
14:  System.out.println(x);
15: } }

A. 4
B.
5 C.
6 D.
7 E.
13 F. The code will not compile because of line 7.
 */