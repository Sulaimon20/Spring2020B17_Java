package day00_ReplIt.Methods;

public class _163MethodsWithReturnValidate {

    public static boolean validateTask(boolean notEmpty,int taskId,int currentId) {

        if (notEmpty == true && taskId  == currentId+1) {
            return true;
        }else{
        return false;}
    }


    public static void main(String[] args) {
        System.out.println(validateTask(false,3,2));

    }
    }
