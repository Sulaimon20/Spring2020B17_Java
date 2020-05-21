package day40_Encapsulation.ReplIt;

public class getterSetter_Encapsulation {
    private String data;
    private int yint;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getYint() {
        return yint;
    }

    public void setYint(int yint) {
        this.yint = yint;
    }

    public static void main(String[] args) {
        Db db = new Db();
        db.insertData("aaa",123);


        System.out.println(db.getData());//aaa
        System.out.println(db.getYint());//123


    }
}
/*

Methods:
    - insertData - lets you set the values to above
    encapsulated instance variables.
    - getData - getter method for private data
    - getYint - getter method for private yint
    - setData - setter method for private data
    - setYint - setter method for private yint



for example:

 Db db = new Db();
 db.insertData("aaa",123);

 System.out.println(db.getData());//aaa
 System.out.println(db.getYint());//123

 db.setData("zzz");
 db.setYint(200);

 System.out.println(db.getData());//zzz
 System.out.println(db.getYint());//200




 */