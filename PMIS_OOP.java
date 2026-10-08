//Date: 08/10/2026 : Thursday
class Car{
    String color;
    String Brand;
    int speed;

    Car(String color, String Brand,int speed){
        this.color = color;
        this.Brand = Brand;
        this.speed = speed;
    }

    void displayInfo(){
        System.out.println("Color: "+color+ ", Brand: "+Brand+ ", speed: "+speed+" Km/hr");
    }
    void accelerate(int incr){
        int incrementedSpeed = incr;
        speed += incrementedSpeed;

        System.out.println("Increased Speed is :"+speed+" Km/hr");
    }
}
public class Main{
    public static void main(String[] args) {
        Car c1 = new Car("Blue","BMW",360);
        c1.displayInfo();
        c1.accelerate(50);
    }
}

//Bank Management System
//Ex.1] 1st way
/* import java.util.Scanner;

class Bank{
    int deposit, withdraw;
    void deposit(int balance,int deposit){
        this.deposit = deposit;
        if(balance<10000){
            System.out.println("NEED TO DEPOSIT SOME AMOUNT.CANNOT WITHDRAW");
            int totalAmount = balance + deposit;
            System.out.println("Amount after deposit: "+totalAmount);
        }
    }
    void withdraw(int balance,int withdraw){
        this.withdraw = withdraw;
        if(balance>10000){
            System.out.println("CAN WITHDRAW AMOUNT.");
            int remainingAmount = balance + withdraw;
            System.out.println("Amount after withdraw: "+remainingAmount);
        }
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = sc.nextInt();
        Bank b1 = new Bank();
        b1.deposit(balance,5000);
        b1.withdraw(balance,5000);
        sc.close();
    }
} */
//Ex.1] 2nd way

class BankAccount{
    String accountHolder;
    double balance;

    BankAccount(String accountHolder , double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount){
        balance += amount;
        System.out.println("Deposited Amount: "+amount);
        System.out.println("Balance after deposit: "+balance);
    }
    void withdraw(double amount){
        if(balance>amount){
            balance-=amount;
            System.out.println("Amount withdrawn: "+amount);
            System.out.println("Balance after withdraw: "+balance);
        }else{
            System.out.println("Insufficient Balance .Given Amount cannot be withdrawn.");
        }
    }
    void displayInfo(String accountHolder, double balance){
        System.out.println("AccountHolder name : "+accountHolder);
        System.out.println("Account Balance: "+balance);
    }
}

public class Main{
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Shreya",100000);
        BankAccount b2 = new BankAccount("Aarya",250000);
        b1.deposit(50000);
        b2.withdraw(50000);
        b1.displayInfo("Shreya",100000);
    }
}
//Task : Ex.3]The Academy Admissions Portal

class StudentProfile{
    String fullName;
    int studentID;
    double finalScore;

    StudentProfile(String fullName, int studentID, double finalScore){
       //Entrance exam takers
       this.fullName = fullName;
       this.studentID = studentID;
       this.finalScore = finalScore;
    }

    StudentProfile(String fullName, int studentID ){
       //Direct Walk-ins
       this.fullName = fullName;
       this.studentID = studentID;
       this.finalScore = 0.0;
    }

    char getGrade(){
        if(finalScore>=90){
            return 'A';
        }else if(finalScore>=75){
            return 'B';
        }else if(finalScore>=50){
            return 'C';
        }else{
            return 'F';
        }
    }
    void printReportCard(){
        System.out.println("Name: "+fullName);
        System.out.println("Student ID: "+studentID);
        System.out.println("Final Score: "+finalScore);
        System.out.println("Grade: "+getGrade());
        System.out.println("------------------------");
    }
}
public class Main{
    public static void main(String[] args) {
       //Exam taker
       StudentProfile s1 = new StudentProfile("Shreya",1,94.00);
       //Walk-ins
       StudentProfile s2 = new StudentProfile("Null",2);
       s1.printReportCard();
       s2.printReportCard();
    }
}
