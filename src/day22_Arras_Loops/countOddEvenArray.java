package day22_Arras_Loops;

public class countOddEvenArray {
    /*
     write a program that can count the even and odd number from an array of integers
                        MUST use for each loop
     */
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,10,11};
        int countOddNum=0;
        int countEvenNum=0;

        for (int each: arr){
            if (each%2!=0){
                countOddNum++;
            }else  {
                countEvenNum++;
            }
        }
        System.out.println("Even numbers: "+countEvenNum);
        System.out.println("Odd numbers: "+countOddNum);
        System.out.println(countEvenNum+countOddNum);
    }
}
