import java.util.*;

public class Main{

    public static void main(String [] args){
    Scanner input = new Scanner(System.in);

        System.out.println("How many numbers index name you want to enter?");
        int num = input.nextInt();

        String [] names = new String[num];
        int [] age = new int[num];

        for (int i = 0 ; i < num; i++ ) {
            System.out.println("Enter the name: ");
            names[i] = input.next();
            System.out.print("Enter "+ names[i]+ " age: ");
            age[i] = input.nextInt();
        }

        System.out.println("Enter index name: ");
        int choice = input.nextInt();

        try {

                if(choice >= 0 && choice <names.length){
                input.close();
                System.out.println("The index name is: "+names[choice]+" | Age is: "+age[choice]);
               
                
            }else{
                throw new NameException("no name in index");
                
        }
            }catch(NameException e){
                
                e.nameError();
            }
            input.close();
            
    }
        
}
