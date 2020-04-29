                package day10_Switch_Scanner;

                import java.util.Scanner;

                public class scannerSalary {
                    public static void main(String[] args) {
                        Scanner input = new Scanner(System.in);
                        System.out.println("Enter your salary per year: ");
                        int salary = input.nextInt();

                        Scanner input2 = new Scanner(System.in);
                        System.out.println("Enter your total hours in a week: ");
                        int hours = input2.nextInt();

                        int rate = ((salary / 52)/hours );
                        System.out.println("Your hourly rate is: "+rate);
                        input.close();

                    }
                }
