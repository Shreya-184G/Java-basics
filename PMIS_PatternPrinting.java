/* public class Month{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice: ");
        int choice = sc.nextInt();
        switch(choice){
            case 1: System.out.println("January");
            case 2: System.out.println("February");
            case 3: System.out.println("March");
            case 4: System.out.println("April");
            case 5: System.out.println("May");
            case 6: System.out.println("June");
            case 7: System.out.println("July");
            case 8: System.out.println("August");
            case 9: System.out.println("September");
            case 10: System.out.println("October");
            case 11: System.out.println("November");
            case 12: System.out.println("December");
            default: System.out.println("Invalid choice");
        }
    }
} */
//Ex.] Swap the values of two integer variables without using any auxiliary variable(or third variable).

/* import java.util.Scanner;

public class SwapVariables{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println(a);
        System.out.println(b);
    }
}
 */
//Ex.] Convert a total number of seconds into minutes, hours and remaining seconds

/* import java.util.Scanner;

public class Seconds{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of total no. of seconds: ");
        float sec = sc.nextInt();
        float min = sec/60;
        System.out.println("The time in minutes for given seconds is: "+min);

        float hrs = sec/3600;
        System.out.println("The time in hours for given seconds is: "+hrs);

    }
} */
//Ex.] Find the largest number among three numbers

/* import java.util.Scanner;

public class LargestNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println(num1+" is largest.");
        }else if(num2 > num1 && num2 > num3){
            System.out.println(num2+" is largest");
        }else{
            System.out.println(num3+" is largest");
        }
    }
} */
//Ex.] Leap year or not
/* import java.util.*;

public class LeapYear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        
        if(( year % 400 == 0) || (year % 4 == 0 && year % 100 != 0 )){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not a Leap Year");
        }
    }
} */
//Date: 06/10/2026
//Pattern Printing 
//Ex.1]
/* public class PatternPrinting{
    public static void main(String[] args) {
        for(int i = 1; i <=5 ; i++){
            for(int j = 1; j<=5; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
} */
//Ex.2] Right-angled Triangle

/* public class PatternPrinting{
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
 */
//Ex.3] To print hollow rectangle

/* public class PatternPrinting{
    public static void main(String[] args){
        int m = 4;
        int n= 5;

        for(int i = 1; i<=m; i++){
            for(int j = 1; j<=n; j++){
               if(i==1|| j ==1 || i==m|| j == n){
                System.out.print("*");
               }else{
                System.out.print(" ");
               }
            }
            System.out.println();
        }
    }
} */
//Ex.] To print inverted triangle

/* public class PatternPrinting{
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i<=n; i++){
            for(int j = n; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
} */

//Ex.] 

/* public class PatternPrinting{
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i<=n ; i++){
            //to print spaces
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }

            //to print stars
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
 */
//Ex.]
/* 1            row =1
12              row =2           n
123             row = 3
1234            row = 4
12345           row = 5       */
/* public class PatternPrinting{
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i ; j++){
              System.out.print(j);
            }
            System.out.println();
        }
    }
} */
/* public class PatternPrinting{
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i<=n; i++){
            for(int j = n; j>=i ; j--){
              System.out.print(i);
            }
            System.out.println();
        }
    }
} */
/* public class PatternPrinting{
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i+1 ; j++){
              System.out.print(j);
            }
            System.out.println();
        }
    }
} */
/* public class PatternPrinting{
    public static void main(String[] args) {
        int n=4;
        for(int i = 1; i<=n;i++){
            for(int j = 1; j<=i ; j++){
                if((i+j)%2==0){
                   System.out.print("1");
                }else{
                    System.out.print("0");
                } 
            }
            System.out.println();
        }
    }
} */

//Calculator to print Area

import java.util.Scanner;

public class PatternPrinting{
    public static void main(String[] args) {
        System.out.println("Choose the shape whose area is to be calculated:");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        System.out.println("1.Square 2.Rectangle 3.Triangle");
        switch(choice){
           case 1:
            System.out.println("Enter the side of Square: ");
            float side = sc.nextFloat();
            System.out.println("Area of Square: "+side*side);
            break;
            case 2:
            System.out.println("Enter the length of Rectangle: ");
            float length = sc.nextFloat();
            float breadth = sc.nextFloat();
            System.out.println("Area of Rectangle: "+length*breadth);
            break;
            case 3:
            System.out.println("Enter the base of Triangle: ");
            float base = sc.nextFloat();
            float height = sc.nextFloat();
            System.out.println("Area of Triangle: "+(0.5)*base*height);
            break;
        }

    }
}
