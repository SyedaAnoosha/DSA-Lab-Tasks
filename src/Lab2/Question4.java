package Lab2;

import java.util.Random;

import static java.lang.Math.random;

class Game{
    int PlayerNumbers;
    int num1,num2;
    int count1 = 0, count2 = 0;
    public void play(){
        Random random = new Random();
        PlayerNumbers = random.nextInt(15);
        System.out.println("Total No. Of Players in your team : "+PlayerNumbers);
        for (int i = 1; i <= PlayerNumbers ; i++) {
            num1 = random.nextInt(100);
            num2 = random.nextInt(100);

            System.out.println("Number 1 : "+num1);
            System.out.println("Number 2 : "+num2);

            if(num1==num2){
                System.out.println("Enemy got hit by your team!");
                count1++;
            }
            else{
                System.out.println("You got hit by the enemy team!");
                count2++;
            }
        }
        if(count1>count2){
            System.out.println("Game Over! You Won");
        }
        else{
            System.out.println("Game Over! You Lost");
        }
    }
}
public class Question4 {
    public static void main(String[] args) {

        Game game = new Game();
        game.play();
    }
}
