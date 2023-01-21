import java.util.*;

public class day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Salary: ");
        double salary = sc.nextInt();
        double hra = 0;
        double da = 0;
        double totalSalary = 0;
        if (salary >= 5000) {
            hra = (salary * 0.10);
            da = (salary * 0.20);
            totalSalary = hra + da + salary;
            System.out.println("Hra is :" + hra);
            System.out.println("Da is : " + da);
            System.out.println("Total Salary is: " + totalSalary);

        } else if (salary < 5000) {
            hra = (salary * 0.20);
            da = (salary * 0.30);
            totalSalary = (salary * 0.20) + (salary * 0.30) + salary;
            System.out.println("Hra is :" + hra);
            System.out.println("Da is : " + da);
            System.out.println("Total Salary is: " + totalSalary);
        }

        sc.close();

    }
}