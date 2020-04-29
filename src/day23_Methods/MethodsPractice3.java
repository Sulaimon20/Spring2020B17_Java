package day23_Methods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MethodsPractice3 {
    public static void main(String[] args) {
        /*
        4. create a function that can print the maximum number from any given array
	    5. create a function that can print the minimum number from any given array
	    6. create a function that can print out the array in descending order
		[1,2,3] == > [3,2,1]
         */
    maxNumber();
    minNumber();
descending();

    }
    public static void maxNumber(){
//        4. create a function that can print the maximum number from any given array
    int [] arr={2,56,-1,24,6,32};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //[-1, 2, 6, 24, 32, 56]
        int lastNum = arr[arr.length - 1];
        System.out.println(lastNum);//56

    }

    public static void minNumber(){
//        4. create a function that can print the minimum number from any given array
        int [] arr={2,56,-1,24,6,32};
        Arrays.sort(arr);

        int countMin=0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]<countMin){
                countMin=arr[i];
            }
        }
        System.out.println("Minimum number: "+countMin);//Minimum number: -1
    }

    public static void descending(){
//
        //  6. create a function that can print out the array in descending order
        //		[1,2,3] == > [3,2,1]

        int [] arr={1,2,3,4,5};

        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5]
        int [] DesArr=new int [arr.length];// create a new arrays with zero numbers
    //    the length of new array should match with old one
        int j=arr.length-1;                 // we create a variable that match a length of array
        for (int i=0; i<arr.length; i++){   //we increase a index (i for RevArr)
            DesArr[i]=arr[j];               // RevArr[index(i)]=arr[numbers(j)]
            j--;                            // we reduce the numbers (j by 1)
        }
        System.out.println(Arrays.toString(DesArr));//[5, 4, 3, 2, 1]




        }

    }

