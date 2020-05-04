package day00_SelfPractice.NestedLoop;

public class NestedIfWeek_Days {
    public static void main(String[] args) {
        int y = 99;
        String result2 = "";

        if (y> 0 && y < 8) {
            result2=(y==1)?"Monday"
                    :(y==2)? "Tuesday"
                    :(y==3)? "Wednesday"
                    :(y==4)? "Thursday"
                    :(y==5)? "Friday"
                    :(y==6)? "Saturday":"Saturday";
        }else {
            result2="Invalid";}
            System.out.println(result2);

    }
}

        /*
        int x = 1;
        String weekday2 = "";
        if (x <= 1 && x < 8) {
            if (x == 1) {
                weekday = "Monday";
            } else if (x == 2) ;
            {
                weekday = "Tuesday";
            }else if (x == 3) ;
            {
                weekday = "Wednesday";
            }else if (x == 4) ;
            {
                weekday = "Thursday";
            }else if (x == 5) ;
            {
                weekday = "Friday";
            }else if (x == 6) ;
            {
                weekday = "Saturday";
            }else if (x == 2) ;
            {
                weekday = "Sunday";
            } else{
                weekday = "Invalid";
            }
            System.out.println(weekday);

        }
    }
}

         */