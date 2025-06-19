package Programs;

import java.util.Scanner;

public class Day_calculator {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Date :");
        int date = sc.nextInt();

        System.out.print("Enter the Month Like This example (June):");
        String month = sc.next().toLowerCase();

        System.out.print("Enter the Year :");
        int year = sc.nextInt();

        System.out.println(date+ " "+ month+ " "+ year);



        // step 1 

        int step1 = date + (year%100);
        //System.out.println(step1);

        // step 2

        int step2 = (year%100)/4 ;
        //System.out.println(step2); 

        // step 3

        int monthcode = 0;
        switch (month) {
            case "january":
                if (year%4==0 || year%400==0) {
                    monthcode = 6;
                }
                else{
                    monthcode = 0;
                }
                break;

            case "february":
                if (year%4==0 || year%400==0) {
                    monthcode = 2;
                }
                else{
                    monthcode = 3;
                }
                break;

            case "march":
                    monthcode = 3;
                break;

            case "april":
                    monthcode = 6;
                break;

            case "may":
                    monthcode = 1;
                break;

            case "june":
                    monthcode = 4;
                break;

            case "july":
                    monthcode = 6;
                break;

            case "august":
                    monthcode = 2;
                break;

            case "september":
                    monthcode = 5;
                break;

            case "october":
                    monthcode = 0;
                break;

            case "november":
                    monthcode = 3;
                break;

            case "december":
                    monthcode = 5;
                break;
        
            default:
                    System.out.println("Invalid Month");
                break;
        }

        //System.out.println(monthcode);
        

        // step 4
        int yearcode =0;
        if (year>=1800 && year<=1899) {
            yearcode = 2;
        }
        else if(year>=1900 && year<=1999){
            yearcode = 0;
        }
        else if(year>=2000 && year<=2099){
            yearcode = 6;
        }
        else if(year>=2100 && year<=2199){
            yearcode = 4;
        }
        else{
            System.out.println("Please Enter year in the range of 1800 to 2199");
        }

        //System.out.println(yearcode);


        // step 5

        int add = step1 + step2 + monthcode + yearcode;
        int total = add % 7;
        //System.out.println("final answer"+total);


        // step 6

        switch (total) {
            case 1:
                System.out.println("Monday is the day you have born !!");
                break;

            case 2:
                System.out.println("Tuesday is the day you have born !!");
                break;

            case 3:
                System.out.println("Wednesday is the day you have born !!");
                break;

            case 4:
                System.out.println("Thursday is the day you have born !!");
                break;

            case 5:
                System.out.println("Friday is the day you have born !!");
                break;

            case 6:
                System.out.println("Saturday is the day you have born !!");
                break;

            case 7:
                System.out.println("Sunday is the day you have born !!");
                break;
        }




    }


        
        

     

    
}
