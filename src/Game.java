import java.util.Scanner;

public class Game {
    public static void gameStart(){
        System.out.println("Would you like to play the game? [y/n] ");
        Scanner input = new Scanner(System.in);
        char response =input.next().charAt(0);
        if(response == 'n'){
            System.out.println("Exiting game");
            return;
        }else if(response == 'y'){
          forkOne();
        }else{
            System.out.println("Please enter valid response [y/n]");
            gameStart();
        }
    }
    public static void forkOne(){
        Scanner input = new Scanner(System.in);
        System.out.println("You are standing on a road, a forest is to the West, the Road leads North. ");
        System.out.println("What would you like to do? \n 1. Go to the forest \n 2. Take the road that leads North");
        char choice1= input.next().charAt(0);
        if(choice1 == '2'){
            System.out.println("Wrong path");
        }else if(choice1 == '1'){
            forkTwo();
        }else{
            System.out.println("Please enter valid response [1/2]");
            forkOne();
        }
    }
    public static void  forkTwo(){
        Scanner input = new Scanner(System.in);
        System.out.println("You have chosen the brave path. \n You have come to a Stream and there is also a Path.");
        System.out.println("Which do you follow? \n 1. Stream \n 2. Path");
        char choice2= input.next().charAt(0);
        if(choice2 == '2'){
            System.out.println("Wrong path");
        }else if(choice2 == '1'){
            System.out.println("You have found your Boat, congratulations!");
        }else{
            System.out.println("Please enter valid response [1/2]");
            forkTwo();
        }

    }
    public static void main(String[] args) {
       gameStart();
    }

}
