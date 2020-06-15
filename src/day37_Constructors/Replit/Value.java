package day37_Constructors.Replit;
//_207_OOP_10_VAL

public class Value {
    private int val = 0;
    private boolean wasModified = false;

    public Value (int val){
        this.val=val;
    }
    public Value(){
        this.val=val;
    }

    public void setVal(int val) {
        this.val = val;
        wasModified=true;
    }

    public boolean wasModified(){
        if (wasModified){
            return true;
        }else {
            return false;
        }
    }

    public int getVal() {
        return val;

        }


    public static void main(String[] args) {
        Value obj=new Value();
        obj.setVal(23);

        System.out.println(obj.getVal());
        obj.wasModified();
        System.out.println(obj.wasModified);


    }

    }


