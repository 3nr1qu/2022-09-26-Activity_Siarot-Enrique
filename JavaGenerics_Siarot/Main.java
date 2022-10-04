import java.util.*;

public class Main{

    public static void main(String [] args){
    Scanner input = new Scanner(System.in);

        System.out.println("How many numbers index name you want to enter?");
        int num = input.nextInt();

        String [] names = new String[num];

        for (int i = 0 ; i < num; i++ ) {
            System.out.println("Enter the name: ");
           names[i] = input.next();
        }

        System.out.println("Enter index name: ");
        int choice = input.nextInt();

        try {
                if(choice< 0 || choice >5 && choice< 0 || choice >4){
                input.close();
                throw new NameException("no name in index");
            }
        
                System.out.println("The index name is: "+names[choice]);
            }catch(NameException e){
                
                e.nameError();
            }
            input.close();

    }
        
}
