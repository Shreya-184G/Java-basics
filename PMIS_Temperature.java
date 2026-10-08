/* 
public class Practice {
    public static void main(String[] args) {
        //System.out.println("I PLAY FOOTBALL.");
        /* System.out.println("MANGO");
        System.out.println("APPLE");
        System.out.println("CHERRY"); */
        /* Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Your name is:"+name); */

        /* int num1 = 500;
        int num2 = 555;
        int result = num1 + num2;
        System.out.println(num); */

        /* String str1 = "500";
        String str2 = "555";
        System.out.println(str1 + " " +str2); */

        /* System.out.println("A B C");
        System.out.println("D E F");
        System.out.println("G H I"); 
        
        System.out.print("Hi"+"\""+firstName+" "+lastName+"\"")
        */
        /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1 = sc.nextInt();
        System.out.println("Enter num2:");
        int num2 = sc.nextInt();
        if(num1 > num2){
            System.out.println(num1+" is greater than "+num2);
        }else if(num1 < num2){
            System.out.println(num1+" is lesser than "+num2);
        }else{
            System.out.println(num1+" is equal to "+num2);
        } */
        
        /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1 = sc.nextInt();
        
        if(num1 > 0){
            System.out.println(num1+" is positive ");
        }else if(num1 < 0){
            System.out.println(num1+" negative ");
        }else{
            System.out.println(num1+" is equal to zero");
        }  */
        /* int age = 16;
        boolean drivingLicense = true;

        if(age>=18&& drivingLicense){
            System.out.println("You can drive.");
        }else if (age>=18 && drivingLicense!= true) {
            System.out.println("You cannot drive.");
        }else if(age<=18 && drivingLicense){
            System.out.println("You cannot drive.You are under 18 yrs of age.");
        }else{
              System.out.println("You need a driving license.");
        } */
     
       /* boolean Python = true;
       boolean French = false;
       if(Python && French!= true){
        System.out.println("You need to learn French.");
       }else if (Python!= true && French) {
        System.out.println("You need to learn Python.");
       }else{
        System.out.println("You can apply.");
       } 
    }
} */
//Date : 05/10/2026 - Monday

//Ex.1] Write a program to read  two integers and print their sum as a floating point value.

/* import java.util.*;

public class Practice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of number1: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of number2: ");
        int b = sc.nextInt();
        float sum = a + b;
        System.out.println("The Sum of "+a+" and "+b+"is: " +sum);
        sc.close();
    }
} */

//Ex.2] Convert the temperature given in Fahrenheit into Celsius using: c = (r-32)*5/9

/* import java.util.*;

public class Temperature{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float f = sc.nextFloat();
        float c = (f-32)*5/9;
        System.out.println("The Temperature in Celsius is: "+c);
        sc.close();
    }
} */
