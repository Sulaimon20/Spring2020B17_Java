package day00_ReplIt;

import java.util.Scanner;

public class Practice_charAt {


        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            //WRITE YOUR CODE HERE
            String word1 = s.next();
            String word2 = s.next();
            if (word1.equalsIgnoreCase(word2)){
                System.out.println("word1 equals word2");
            }else {
                System.out.println("word1 does not equal word1");
            }


            }}
/*

AirPods
Did you just get some AirPods for Christmas? Well, too bad because they're about to be outdated. Apple has officially announced new AirPods. Now you can upgrade your ears with an even better version of the wireless buds.


Assume that you have only 2 users: Max Payne and Alan Wake.  First, ask user to enter full name.
Display message: "Enter full name:". Then take input from user.
If name is equals to either "Max Payne" or "Alan Wake",  display message: "User found!".
 Otherwise,  display message: "User not found!". Please make your search case insensitive!
Example:
Display message: Enter full name:
input: Max Payne
Display message: User found!


using substring method output the first two letters of text string
for examole:
String txt = "foo"
the first two letters are "fo"


use print not println.

ask the user for his name, capture it on a string using scanner.

then output the length of the name string.



using charAt method output the 5th letter of txt string then the 6th letter then the 6th letter.

use print not println.
 */