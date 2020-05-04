package day00_Re_Studying;

public class removeAllSpaceSpring {
    public static void main(String[] args) {

        String str = "     Such   a    good   day    today    ";
        String result =str.trim().replaceAll(" +", " ");
        System.out.println(result);

    }
}
