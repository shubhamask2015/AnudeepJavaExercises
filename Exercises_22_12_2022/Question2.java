/*2) Write a program for fuctional interface with inner 
class and one method inside it and static and default method
inside it and use lambda expressions and call the inner class method
*/

interface IMyInterface{
    static void show(){
        System.out.println("Static methode inside interface");
    }
    void display();
    static class Inner{
        static void hello(){
            System.out.println("Hello from Anudeep Java Programming!!!");
        }
    }

}
public class Question2 {
    public static void main(String[] args) {
        IMyInterface.Inner.hello();

        IMyInterface iref = ()->{
            System.out.println("Functional interface");
        };

        iref.display();

        IMyInterface.show();
    }
}
