package DSALab1Tasks;

import java.util.Scanner;

public class MCQ {
    public static void main(String[] args) {
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
}

