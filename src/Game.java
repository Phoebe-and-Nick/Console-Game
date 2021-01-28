import java.util.Scanner;

public class Game {
    public static void gameStart(boolean hasSwordStart){
        System.out.println("Would you like to play the game? [y/n] ");
        Scanner input = new Scanner(System.in);
        char response =input.next().charAt(0);
        if(response == 'n'){
            System.out.println("Exiting game");
            return;
        }else if(response == 'y'){
          forkOne(hasSwordStart);
        }else{
            System.out.println("Please enter valid response [y/n]");
            gameStart(hasSwordStart);
        }
    }
    public static void forkOne(boolean hasSwordOne){
        Scanner input = new Scanner(System.in);
        System.out.println("You are standing on a road, a forest is to the West, the Road leads North. To the east you see a sword sticking out of a large Boulder.");
        System.out.println("What would you like to do? \n 1. Go to the forest \n 2. Take the road that leads North\n3.Take the sword.");
        char choice1= input.next().charAt(0);
        if(choice1 == '2'){
            System.out.println("A troll is guarding the road.\n He spots you and comes running at you. \n He crushes you beneath his thumb.\n Game Over.");
            System.exit(0);
        }else if(choice1 == '1'){
            forkTwo();
        }else if(choice1 == '3'){
            hasSwordOne = true;
            System.out.println(hasSwordOne + "This is inside fork one after choice 3");
            forkOneB(hasSwordOne);

        }else{
            System.out.println("Please enter valid response [1/2/3]");
            forkOne(hasSwordOne);
        }
    }
    public static void forkOneB(boolean hasSword1B){
        Scanner input = new Scanner(System.in);
        System.out.println("Now that you have the Sword, Would you like to go forest is to the West, or the Road leads North.");
        System.out.println("What would you like to do? \n 1. Go to the forest \n 2. Take the road that leads North\n");
        char choice1= input.next().charAt(0);
        if(choice1 == '2'){
            System.out.println("A troll is guarding the road.\n He spots you and comes running at you. \n He crushes you beneath his thumb.\n Game Over.");
            System.exit(0);;
        }else if(choice1 == '1') {
            forkTwo(hasSword1B);
        }else{
            System.out.println("Please enter valid response [1/2]");
            forkOneB(hasSword1B);
        }
    }
    public static void  forkTwo(boolean hasSwordTwo){
        Scanner input = new Scanner(System.in);
        System.out.println("You have chosen the brave path. \n You have come to a Stream and there is also a Path.");
        System.out.println("Which do you follow? \n 1. Stream \n 2. Path");
        char choice2= input.next().charAt(0);
        if(choice2 == '2'){
            //If bool - if- true continue to 3 -else exit
            System.out.println("You find a giant snake.\n He uncoils and swallows you whole.\n You killed the snake.");
            System.out.println("Present other options");//uses sword and continues
            System.exit(0);
        }else if(choice2 == '1'){
            System.out.println("You have found your Boat, congratulations!");
        }else{
            System.out.println("Please enter valid response [1/2]");
            forkTwo(hasSwordTwo);
        }
    }
    public static void  forkTwo(){
        Scanner input = new Scanner(System.in);
        System.out.println("You have chosen the brave path. \n You have come to a Stream and there is also a Path.");
        System.out.println("Which do you follow? \n 1. Stream \n 2. Path");
        char choice2= input.next().charAt(0);
        if(choice2 == '2'){
            //If bool - if- true continue to 3 -else exit
            System.out.println("You find a giant snake.\n He uncoils and swallows you whole.\n Game Over.");
            System.exit(0);
        }else if(choice2 == '1'){
            System.out.println("You have found your Boat, congratulations!");
        }else{
            System.out.println("Please enter valid response [1/2]");
            forkTwo();
        }
    }


    public static void main(String[] args) {
        Boolean hasSword = false;
        gameStart(hasSword);
        forkOne(hasSword);
    }
}
