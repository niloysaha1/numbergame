import java.util.*;
class numbergame {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        int n,l=0,w=0,f=0;
        System.out.println("\t\t\t******WELCOME******\n\n");
        System.out.println("Guess the number between 1-100\nEnter a number");
        do{
            if(f==1)
            System.out.println("Guess the number again");
            n=sc.nextInt();
            if(n==45){
                w++;
                System.out.println("\n\nCorrect!!\nWin-"+w +"\tloss-"+l+"\n\nDo you want play again if YES enter 1 or if you want to exit the game enter 0");
                f=sc.nextInt();
            }
            else if(n!=45){
                l++;
                System.out.println("\n\nwrong!!\nWin-"+w +"\tloss-"+l);
                if(n>45 && n<=60)
                System.out.println("You are on the higher side but you are near to the correct number");
                else if(n>60)
                System.out.println("Your guessing number is too high");
                else if(n<45 && n<=30)
                System.out.println("You are on the lower side but you are near to the correct number");
                else if(n<30)
                System.out.println("Your guessing number is too low");
                
                
                System.out.println("\n\nDo you want play again if YES enter 1 or if you want to exit the game enter 0");
                f=sc.nextInt();
            }            
        }while(f==1);  
        System.out.println("\n\n\n ******the game is end********");
    }    
}