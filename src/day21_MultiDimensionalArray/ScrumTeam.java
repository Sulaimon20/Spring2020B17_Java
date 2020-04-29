package day21_MultiDimensionalArray;

public class ScrumTeam {
    public static void main(String[] args) {
        //                   0      1       2       3
        String [] DevTeam={"Anna", "Ted", "Tim", "Muhtar"};
        String [] Testers={"Said", "Dev", "Sama", "Jim"};
        String [] PO={"Sulaimon", "Omar"};

        String [] TeasterTeam2={"Orzu", "Adab", "Shon", "Been"};
        String[][] ScrumTeam = {DevTeam, Testers, PO};
        //                          0       1
        ScrumTeam[0][3]="Jean"; // Jean donna replace Muhtar

        System.out.println(ScrumTeam[0][3]);//Jean
        ScrumTeam[1]=TeasterTeam2;

        String info = ScrumTeam [1][2];
        System.out.println(info);//Sama

        System.out.println("==========================");

        System.out.println("The list of DevTeam:");
        for(String each: ScrumTeam[0]){
        System.out.println(each);
        }
        System.out.println("===========================================");


    }
}
