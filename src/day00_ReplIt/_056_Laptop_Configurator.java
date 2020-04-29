package day00_ReplIt;

import java.util.Scanner;

public class _056_Laptop_Configurator {

        public static void main(String[] args) {
            double price = 0;
            String storageType, screenType, cpu;
            int ram = 0 ;
            Scanner scan = new Scanner(System.in);
            //WRITE YOUR CODE HERE


            System.out.println("Select screen size:");
            double screen = scan.nextDouble();

            if (screen==13.3){
                price+=200;
            }else if(screen==15.0){
                price+=300;
            }else if (screen==17.3) {
                price+=400;
            }

            System.out.println("Select CPU type:");
             cpu = scan.nextLine();
            if(cpu.equalsIgnoreCase("i3")){
                price+=150;
            }else if (cpu.equalsIgnoreCase("i5")){
                price+=250;
            }else if (cpu.equalsIgnoreCase("i7")){
                price+=350;
            }
            scan.nextLine();
            System.out.println("Select RAM size:");
                ram = scan.nextInt();
            for(int i = 4; i <= ram; i += 4){
                price += 50;
            }

            System.out.println("Select storage type:");
                 storageType = scan.next();

            System.out.println("Enter memory size:");
            int memorySize = scan.nextInt();

            if(storageType.equalsIgnoreCase("SSD")){
                for(int i = 0; i < memorySize; i += 500){
                    price += 100;
                }
            } else if(storageType.equalsIgnoreCase("HDD")){
                for(int i = 0; i < memorySize; i += 500){
                    price += 50;
                }
            }
            scan.nextLine();

                System.out.print("Enter screen resolution:");
                String screenRes = scan.next();
            if(screenRes.equalsIgnoreCase("fullhd")){
                price += 100;
            } else if(screenRes.equalsIgnoreCase("4k")){
                price += 200;
            }

                System.out.println("Laptop price is: $"+price);

            }
        }


