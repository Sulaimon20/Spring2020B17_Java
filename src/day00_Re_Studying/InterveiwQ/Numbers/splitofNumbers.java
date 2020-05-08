package day00_Re_Studying.InterveiwQ.Numbers;

public class splitofNumbers {
    public static void main(String[] args) {
        int x=43589;
        int sum=0;
       // while (x>0)
        //System.out.println(sum);

        int a=x%100000/10000;//4

        int b=x%10000/1000;//2
        int c=x%1000/100;//3
        int d=x%100/10;//4
        int e=x%10/1;//5
         int q=x%100000;
         int w=x/10000 ;



        System.out.println(a+" "+b+" "+c+" "+d+" "+e);
        System.out.println(q);
        System.out.println(w);
        //System.out.println(z+"");



    }
}
