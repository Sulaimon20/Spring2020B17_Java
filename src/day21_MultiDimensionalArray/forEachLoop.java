package day21_MultiDimensionalArray;

public class forEachLoop {
    public static void main(String[] args) {
        /*
        for (DataType variableName: ArrayName{
        }
         */
        // for numbers we use this
        int [] nums={1,2,3,4,5,6,7};
        for (int eachElement: nums){//executed 4 times=1,2,3,4
            System.out.println(eachElement); // 1,2,3,4
        }
       // for String we do this

        String [] names={"Sam", "Max", "Tom", "Liz"};
        for (String eachElement: names){//executed
            System.out.print(eachElement+", "); // Sam Max Tom Liz
        }
        // for char we use
        char[] ch={'A', 'B', 'C', 'D'};
        for (char eachElement: ch){
        }
        System.out.println(ch);// ABCD

        int [] arr1={1,2,3,4,5,6,7,8};
        for (int eachElement: arr1){
            if (eachElement<5){
                continue;
            }
            System.out.println(eachElement);// 5 6 7 8
        }
        System.out.println("+===================================");

        String sentence="I like java";
        String word[]=sentence.split(" "); // [I, like, java]
        for (int i=word.length-1; i>=0; i--){
            System.out.println(word[i]);// java like I
        }


        for (String eachWord: word){// index 0~2
            System.out.println(eachWord);// I like java
        }

        System.out.println("===========================");
int result=0;
        int [] arr2={1,2,3,4,5,6,7,8};
        for (int eachElement: arr1) {
            if (eachElement%2==0) {
                result=eachElement+eachElement;
                continue;
            }
            System.out.println(result+"");// 5 6 7 8
        }
        }

    }

