package day24_ReturnMethods.WarmUp;

public class StudyingHoursCybertek {
    public static void main(String[] args) {
        int numDay=24;
        int SoftNumDay=6;
        int morningHours=4;
        int afternoonHours=4;
        int officeHours=3;
        System.out.println("Total java classes: "+javaClass(numDay,morningHours,afternoonHours,officeHours));
        System.out.println("Total soft skills classes "+softSkillClass(afternoonHours,SoftNumDay));
    }
    public static int javaClass(int numDay, int morningHours, int afternoonHours, int officeHours){
        int totalHours=numDay*(morningHours+afternoonHours+officeHours);
        return totalHours;
    }
    public static int softSkillClass(int afternoonHours,int SoftNumDay){
        int totalHours=afternoonHours+SoftNumDay;
        return totalHours;
    }
}
