package day08_IfStatements;

public class MultiBranchIf {
    public static void main(String[] args) {
        double a=-100.1;
        if (a==0){
            System.out.println("zero");
        }
        else if (a>0){
            System.out.println("positive");
        }
        else {
            System.out.println("negative");
        }
    }
}

/*
ulti branch if statement (else if) : if there are more than two possibilities, or option
            if(Condition1){
                    statement1;  // gets executed if condition1 is true
            } else if(condition2){
                    sattement2; // gets executed if condition1 is false and condition2 is true
            } else {  // other wise
                    statement3;  // gtes executed if all condition1 & 2 are failed
            }
 */