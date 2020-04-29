package day19_Arrays;

public class emailsArray1 {
    public static void main(String[] args) {

        String [] emails={"cybertek@yahoo.com", "cybertek@gmail.com", "cybertek@hotmail.com", "cybertek@outlook.com"};
        // print all the users who registred with their gmail
        for(int i=0; i<3; i++){
            String email=emails[i];
            if (email.endsWith("gmail.com")){
                System.out.println(email);
            }if (email.contains("hotmail.com")){
                System.out.println(email);
            }


        }
    }
}
