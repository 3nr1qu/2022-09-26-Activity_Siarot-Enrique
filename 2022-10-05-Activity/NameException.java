public class NameException extends Exception{
    public NameException(String message){
        super(message);
    }
    public NameException(){

             }
    public void nameError(){
        System.out.println("Your input exceeds the size of the array");
    }
}


