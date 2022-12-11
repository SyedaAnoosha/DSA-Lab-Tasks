package DSALab1Tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab1 {
    public void mcq(){
        String Ques="What is Iran's capital?";
        String choice1="Tehran", choice2="Baghdad";
        String correctAns=choice1;

        System.out.println(Ques);
        System.out.println("a) "+choice1+"  b)"+choice2);

        Scanner scanner= new Scanner(System.in);
        String answer=scanner.nextLine();

        if(answer.equals(correctAns)){
            System.out.println("Congrats!! :D");
        }
        else{
            System.out.println("Wrong Answer :(");
        }
    }

    public void ticket(){

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

    public void menuBuilder(){

        // Create a variable called menuTitle of type String and assign it the value "My Dream Menu:".
        String menuTitle="My Dream Menu:";

        // Print the menuTitle variable to the console.
        System.out.println(menuTitle);

        // Create a variable called menu of type ArrayList.
        ArrayList<String> menu = new ArrayList<>();

        // Create a variable called starter of type string and pass in the name of your favourite starter.
        String starter = "Soup";

        // Add the starter variable to the ArrayList called menu.
        menu.add(starter);

        // Create a variable called mainCourse of type string and pass in the name of your favourite main course.
        String mainCourse = "Biryani";

        // Add the mainCourse variable to the ArrayList called menu.
        menu.add(mainCourse);

        // Create a variable called dessert of type string and pass in the name of your favourite dessert.
        String dessert="Custard";

        // Add the dessert variable to the ArrayList called menu.
        menu.add(dessert);

        // Print the menu variable to the console.
        System.out.println(menu);
    }

    public void empSal(){

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

    public void employee(){

        // Create a variable called age of type int and assign it the value 29.
        int age=29;

        // Print the age variable to the console.
        System.out.println(age);

        // Create a variable called isAManager of type boolean and assign it the value true.
        boolean isAManager= true;

        // Print the isAManager variable to the console.
        System.out.println(isAManager);

        // Create a variable called yearsOfService of type double and assign it the value 2.5.
        double yearsOfService=2.5;

        // Print the yearsOfService variable to the console.
        System.out.println(yearsOfService);

        // Create a variable called baseSalary of type int and assign it the value 3000.
        int baseSalary=5000;

        // Create a variable called overtimePayment of type int and assign it the value 40.
        int overtimePayment=40;

        // Create a variable called totalPayment of type int and assign it to the value of baseSalary added to overtimePayment.
        int totalPayment = baseSalary + overtimePayment ;

        // Print the totalPayment variable to the console.
        System.out.println(totalPayment);

        // Create three variables all of type double on a single line.
        // They should be called firstBonus, secondBonus and thirdBonus and they should be assigned the values 10.00, 22.00 and 35.00.
        double firstBonus=10.00,secondBonus=22.00,thirdBonus=35.00;

        // Print out the sum of the variables called firstBonus, secondBonus and thirdBonus.
        double sum=firstBonus+secondBonus+thirdBonus;

        System.out.println(sum);

    }
}
