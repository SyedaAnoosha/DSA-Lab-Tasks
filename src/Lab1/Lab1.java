package Lab1;
import java.util.Scanner;

public class Lab1 {
    public void ticket(){
        System.out.println("TASK # 2");
        System.out.println("Enter age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 65) {
            System.out.println("ticket is $7 ");
        } else if (age > 13) {
            System.out.println("ticket is $10");
        }else if (age < 13) {
            System.out.println("ticket cost is $5");
        }
    }
    public void mcq(){
        System.out.println("TASK # 3");
        String Ques="What is Iran's capital?";
        String choice1="Tehran", choice2="Baghdad", choice3="syria";
        String correctAns=choice1;
        System.out.println(Ques);
        System.out.println(">) "+choice1+"  >)"+choice2+"  >)"+choice3);
        Scanner scanner= new Scanner(System.in);
        String answer=scanner.nextLine();
        if(answer.equalsIgnoreCase(correctAns)){
            System.out.println("Congrats!! You got it right :)");
        }
        else{
            System.out.println("Wrong Answer :(");
        }
    }
    public void empSal(){
        System.out.println("TASK # 4");
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
