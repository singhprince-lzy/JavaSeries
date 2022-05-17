package javaProject;



import java.util.Scanner;

public class CalenderClass {

    //write code to display the calender
    public void displayCalender(){

        //declare variables for month, year, firstDay and daysInMonth
		int months,year,firstDay,daysInMonth;
		
        //Declare Scanner object to take input
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter month(Press 1 for Jan, 2 for Feb, 12 for Dec......):");
     //take input for month
	 	months=sc.nextInt();
        System.out.println("Enter Year:");
		year=sc.nextInt();
      //take input for year
        System.out.println("Enter Day of week(Press 1 for Mon, 2 for Tue, 7 for Sun......):");
        //take input for firstDay
		firstDay=sc.nextInt();


        //check leap year
		     String[] months1 = { "", "Jan", "Fab", "Mar", "Apr", "May", "Jun", "Jul", "Aug","Sep","Oct", "Nov", "Dec" };
        int[] Days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // ! Cheacking leap year or not

        if ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0))) {
            Days[2] = 29;
        }
        int max = 0;
        for (int i = 0; i < 12; i++) {
            if (months== i) {
                max = Days[i];
            }
        }


		int A[][] = new int[6][7];
        int x = 1, z = firstDay;

        for (int i = 0; i < 6; i++) {
            for (int j = firstDay; j < 7; j++) {
                if (x <= max) {
                    A[i][j] = x;
                    x++;
                }
            }
            firstDay = 0;
        }
        for (int j = 0; j < z; j++) {
            A[0][j] = A[5][j];
        }


		System.out.println("\t----------------------------------------------------");
        System.out.println("\tSUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");
        System.out.println("\t----------------------------------------------------");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if (A[i][j] != 0)
                    System.out.print("\t " + A[i][j]);
                else
                    System.out.print("\t ");
            }
            System.out.println("\n");
        }

    }

    public static void main(String[] args) {
        CalenderClass calenderClass = new CalenderClass();
        calenderClass.displayCalender();

    }

}
