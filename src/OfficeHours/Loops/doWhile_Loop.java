package OfficeHours.Loops;
public class doWhile_Loop {
    public static void main(String[] args) {
        int i=1;
        do{
            System.out.println("Hello =>"+i);//sout: Hello =>1; Hello =>2; Hello =>3
            i++;
        }while (i<=3);

        System.out.println("=====================");
        int j=0;
        do {
            if (j%15==0){
                System.out.print(j+" ");}//sout: 0 15 30 45 60 75 90
            j++;
        }while (j<=100);

    }
}
