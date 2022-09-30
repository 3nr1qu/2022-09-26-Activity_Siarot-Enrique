import java.util.*;

 

class HashSetSiarot{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Scanner a = new Scanner(System.in);
        HashSet<Integer> hs = new HashSet<>();

		hs.add(14);
		hs.add(36);
		hs.add(12);
		hs.add(11);
		hs.add(9);

		
      
        char option;
        
        do{
            System.out.println("\n   **************************");
            System.out.println("   Set: " + hs);
             System.out.println("\n   **************************");
            System.out.println(" \n  ");
            System.out.println("   HASHSET  ");
            System.out.print("\n   [1] Add Numbers \n   [2] Delete Numbers \n   [3] Display Numbers \n   [4] Clear \n   [5] Exit \n\n   Your Choice: ");
            option = s.next().charAt(0);
            
            switch(option){
                case '1':
                    System.out.print("   Enter num: ");
                    int number = a.nextInt();

                    if(hs.contains(number)){  
                        System.out.println("   "+number +" already exist in the Hashset, try again!");  
                    }         
                    else{
                        hs.add(number);
                        System.out.println("   "+number +" is added to the Hashset.");  
                    }  
                    
                    
                break;
                
                case '3':
                    System.out.println("\n ");
                    System.out.println("   Display Number ");
                    System.out.println("   Set: " + hs);
                    System.out.println("\n ");
                break;
                case '2':
                    System.out.print("   Choose number to delete: ");
                    int num = s.nextInt();
                    
                    hs.remove(num);
                    System.out.println("   The removed number number is:" + num);
                    System.out.println("   Updated Set: " + hs);
                    
                    
                break;
                case '4':
                    System.out.println("\n ");
                    System.out.println("   All Numbers are Successfully Clear!!! ");
                    hs.clear();
                break;
                case '5':
                    
                    System.out.println("   GOODBYE!!! ");
                    System.exit(0);
                break;
                
                default:
                System.err.println("   Invalid option selected");
                System.exit(0);
            }
            
            
        }while(option!=0);
            
    }
}














    





