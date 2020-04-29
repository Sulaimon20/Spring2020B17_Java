package day18_DoWhileNestedLoop;

public class alphabetTriangle {
    public static void main(String[] args) {


        for (char z='z'; z<='a'; z--){

            for (char ch='a'; ch<=z; ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }

    }
}
