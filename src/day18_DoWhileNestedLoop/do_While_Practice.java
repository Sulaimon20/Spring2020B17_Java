package day18_DoWhileNestedLoop;

public class do_While_Practice {

    public static void main(String[] args) {

        System.out.println("Odd numbers:");
        int i=0;
        do {
            if (i%2!=0){
                System.out.print(i+" ");
            }
            i++;
        }while (i<=20);
        System.out.println("\n============================");

        int j=1;
        do {
            System.out.print(j+" ");
            j++;
        }while (j<=5);
        System.out.println("\n==========================");
        System.out.println("Using break to stop the loop at the number 3");
        int z=1;
        do {
            System.out.print(z+" ");
            if(z==3){
                break;}
            z++;
        }while (z<=5);
        System.out.println("\n=================================");
        System.out.println("Take out the number 3 from the loop using continue");
        int y=1;
        do {
            if (y==3){
                y++;
                continue;
            }
            System.out.print(y+" ");
            y++;
    }while(y<=5);
        System.out.println("\n==============!");

        System.out.println("Even numbers:");
        int t=1;
        do {
            if (t%2!=0){
                t++;
                continue;
                            }
            System.out.print(t+" ");
            t++;
        }while (t<=50);
    }
}
