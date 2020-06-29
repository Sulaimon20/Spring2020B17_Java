package day54_Maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public class Map_SetEntries {

    public static void main(String[] args) {

    LinkedHashMap<String, String> facebookCredential=new LinkedHashMap<>();
    facebookCredential.put("Tester01","password1");
    facebookCredential.put("Tester02","password1");//fake, NOT DUPLICATE!!!
    facebookCredential.put("Tester02","password1");//this one gonna be accepted
    facebookCredential.put("Tester03","password2");//
    facebookCredential.put("Tester04","password3");//
    facebookCredential.put("Tester05","password4");//
    facebookCredential.put("Tester06","password5");//
        System.out.println("facebookCredential = " + facebookCredential);
        System.out.println("=======================================");
        for (String eachKey : facebookCredential.keySet()) {
            //System.out.println(eachKey+" "+facebookCredential.get(eachKey));//Tester01 password1,Tester02 password1, Tester03 password2, Tester04 password3, Tester05 password4, Tester06 password5
           // System.out.println(eachKey);//Tester01, Tester02, Tester03, Tester04, Tester05, Tester06

        }
        //converting from Maps to Collection
        List<String> password=new ArrayList<>(facebookCredential.values());
        System.out.println(password);//[password1, password1, password2, password3, password4, password5]
        List<String> userName=new ArrayList<>(facebookCredential.keySet());
        System.out.println(userName);//[Tester01, Tester02, Tester03, Tester04, Tester05, Tester06]
        System.out.println("===========================================");










    }




}
