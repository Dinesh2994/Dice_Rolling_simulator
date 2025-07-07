import java.util.Scanner;
import java.util.Random;
public class Dice{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int numofDice;
        int total=0;
        System.out.print("Enter the number of times to roll: ");
        numofDice=sc.nextInt();
        if(numofDice>0){
            if(numofDice>0){
                for(int i=0;i<numofDice;i++){
                    int roll=random.nextInt(6)+1;
                    System.out.println("you rolled: "+roll);
                    printDice(roll);
                    total+=roll;

                }
                System.out.println("Total: "+total);
            }
        }
        else{
            System.out.print("Dice must be greater than 0");
        }
        sc.close();
    }
    static void printDice(int roll){
        String dice1="""
                
                -----------
               |           |
               |           |
               |     ●     |
               |           |
               |           |
                -----------
            
                """;
        String dice2="""
                
                -----------
               |  ●        |
               |           |
               |           |
               |           |
               |         ● |
                -----------
            
                """;
        String dice3="""
                
                -----------
               |  ●        |
               |           |
               |     ●     |
               |           |
               |         ● |
                -----------
            
                """;
        String dice4="""
                
                -----------
               |  ●     ●  |
               |           |
               |           |
               |           |
               | ●      ●  |
                -----------
            
                """;
        String dice5="""
                
                -----------
               |  ●      ● |
               |           |
               |     ●     |
               |           |
               |  ●      ● |
                -----------
            
                """;
        String dice6="""
                
                -----------
               | ●      ●  |
               |           |
               | ●      ●  |
               |           |
               | ●      ●  |
                -----------
            
                """;
        switch(roll){
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.print("Invalid roll");

        }
    }
}