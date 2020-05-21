package day00_ReferenceQuiz;
//ANSWER E. The code does not compile.
public class _7 {

    public static void main(String[] args) {

        int [] arr={1,2,3,4};
        int i=0;
    do{
        System.out.print(arr[i]+" ");
        i++;
    }while (i<arr.length+1);
    }

}

/*
What is the result of the following code?
int[] array = {6,9,8};
List<Integer> list = new ArrayList<>();
list.add(array[0]);
list.add(array[2]);
list.set(1, array[1]);
list.remove(0);
System.out.println(list);
A. [8]
B. [9]
C. Something like [Ljava.lang.String;@160bc7c0
D. An exception is thrown.
E. The code does not compile.
 */