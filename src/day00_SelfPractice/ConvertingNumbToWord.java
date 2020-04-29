package day00_SelfPractice;

public class ConvertingNumbToWord {
    public static void main(String[] args) {
        int num = -9;
        String word = (num == 0) ? "Zero"
                    : (num == 1) ? "One"
                    : (num == 2) ? "Two"
                    : (num == 3) ? "Three"
                    : (num == 4) ? "Four"
                    : (num == 5) ? "Five"
                    : (num == 6) ? "Six"
                    : (num == 7) ? "Seven"
                    : (num == 8) ? "Eight"
                    : (num == 9)? "Nine": "Invalid";
        System.out.println(num);

    }
}

/*
        (number > 0 && number <= 9) {
            letter =(number == 1) ? letter = '1'
                    ?letter == 2: '2'
                    ?letter == 3: '3'
                    ?letter == 4: '4'
                    ?letter == 5: '5'
                    ?letter == 6: '6'
                    ?letter == 7: '7'
                    ?letter == 8: '8':'9';
            } else {
            System.out.println("Invalid");
                }
            System.out.println(letter);
        }
    }
}
/*
write a java program that can convert numbers between 0 ~ 9 to words,
if the number is greater than 9 or less than zero, out put should be "Invalid".

 */