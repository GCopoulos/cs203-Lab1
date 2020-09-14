
/**
 * Prints a hello message.
 *
 * @author Gerasimos Copoulos
 * @version 1.0
 */
public class HelloMessenger
{

    /**
     * Constructor for objects of class HelloMessenger
     */
    public HelloMessenger()
    {
    }

    /**
     * Prints the hello message.
     *
     * @param  none
     * @return    No return object, just prints.
     */
    public void PrintHello()
    {
        System.out.println("Hello!  Welcome to this example program for Lab 1!");
    }
    
    public static void main(String[] args){
       HelloMessenger Messenger1 = new HelloMessenger();
       Messenger1.PrintHello();
    }
    
}
