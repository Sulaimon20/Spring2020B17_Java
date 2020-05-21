package OfficeHours._5_13_;

public class staticBlock {
    static String str;

    static {
        str="Cybertek";
    }

}
class staticBlockTest{
    public static void main(String[] args) {
        System.out.println(staticBlock.str);
    }
}