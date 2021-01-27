import java.util.Scanner;

public class Game {
    public static void playGame(){
        System.out.println("Would you like to play the game? [y/n] ");
        Scanner input = new Scanner(System.in);
        char response =input.next().charAt(0);
        if(response == 'n'){
            System.out.println("Exiting game");
            return;
        }else{
            System.out.println("You are standing on a road, a forest is to the West, the Road leads North. ");
            System.out.println("What would you like to do? \n 1. Go to the forest \n 2. Take the road that leads North");
            int choice1= input.nextInt();
            if(choice1 == 2){
                System.out.println("Wrong path");
            }else{
                System.out.println("You have chosen the brave path. \n You have come to a Stream and there is also a Path.");
                System.out.println("Which do you follow? \n 1. Stream \n 2. Path");
                int choice2 = input.nextInt();
                if(choice2 == 2){
                    System.out.println("Wrong path");
                }else{
                    System.out.println("You have found your Boat, congratulations!");
                }
            }
        }
    }
    public static void main(String[] args) {
       playGame();
    }

}
