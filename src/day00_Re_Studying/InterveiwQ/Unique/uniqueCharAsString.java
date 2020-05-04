package day00_Re_Studying.InterveiwQ.Unique;

public class uniqueCharAsString {
    public static void main(String[] args) {
        /*
        Write a program that can print out the unique values from a String Array
			Ex:
				if arr -> {"A", "A", "B", "C", "C"}
				output: B
				if arr -> {"A", "B", "B", "C"}
				output:  A
						 C
						 /*
         */
        //               0    1    2    3 = length =4
        String[] arr = {"A", "B", "B", "A", "G", "G","R","C"};// B
        //                     0
        // we need to compare "A" with others characters
         //how many time this "A" occured in this array

        for (int j=0; j<arr.length; j++){
            int count=0;
            for (int i=0; i<arr.length; i++){//
                if (arr[i].equals(arr[j])){//  this is for checking this character
                    count++;//
                }
            }
            if (count==1){// this is the main code for finding unique character
                System.out.println(arr[j]); // if this character is =1 or the only one
            }
        }


/*


        for (String each2: arr){   // 4,3,2,1
            int count = 0; //

            for (String each : arr) {
                if (each.equals(each2)){
                    count++;
                }
            }
            if (count==1){// if the character is unique and do not repeat.
                System.out.println(each2);
            }
        }

*/
    }
}