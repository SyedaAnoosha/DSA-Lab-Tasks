package DSALab1Tasks;
import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number of hours an employee works per week");
        int hours= sc.nextInt();
        System.out.println("Enter amount of money an employee makes per hour");
        int amount= sc.nextInt();
        System.out.println("Enter the amount of vacations");
        int vac= sc. nextInt();
        int vacHours=vac*8;

        float grossSalary=(12*4*hours*amount)-vacHours;
        System.out.println("Gross salary of employee : "+grossSalary);
    }
}
