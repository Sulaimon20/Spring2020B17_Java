package day00_ReplIt;
import java.util.Scanner;
public class _074_SMSmessage_String_Methods<sender> {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String message = scan.nextLine();
 //Sender:<Mike Smith>.   From Number:[202-123-3456]. Message:{I love programing and problem solving}
 //Sender:<Kuzzat Altay>. From Number:[703-333-2222]. Message:{Hello Everyone!}
    String sender=message.substring(0,message.indexOf(">") );
        String extra=sender.replace("<"," ");
    String phoneNumber=message.substring(message.indexOf("N"), message.indexOf("]")+1);
        String extra2=phoneNumber.replace("["," ");
        String extra3=extra2.replace("]","");
        String extra4=extra3.replace("Number:","Phone Number:");
    String messageBody=message.substring(message.indexOf("Me"), message.indexOf("}")+1);
        String extra5=messageBody.replace("{"," ");
        String extra6=extra5.replace("}","");
        String extra7=extra6.replace("Message: ","Message body: ");

        System.out.println(extra+"\n"+extra4+"\n"+extra7);
    }}
/*
Sender: Mike Smith
Phone Number: 202-123-3456
Message body: I love programing and problem solving
 */