package day00_Re_Studying.InterveiwQ.LeapYear;

public class leapYears {
    public static void main(String[] args) {
        int leapYear;
        for(leapYear=1900; leapYear<=2030; leapYear++){
            if (leapYear%4 !=0 ){
                continue;
            }
            System.out.println("the leap year: "+leapYear);
        }
    }
}
