import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Hello!\n"); //this prints without new line
        System.out.println("My name is Edison!");
        short number = 45;
        System.out.println(number);
        String myName = "Edison";
        System.out.println("My name is "+ myName +" Let's have fun");
        System.out.print("Name\tLast Name\tAge\n");
        // this is similar to format methods in python
        System.out.printf("The value %.2f divided by %d is equal to %.3f\n", 5.45,3,(5.45/3));
        System.out.printf("%d%n%d%n",5,6);
        System.out.printf("%,d%n",201235);
        System.out.printf("%,.2f%n",201235.6579);

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.printf("My name is %s%n",name);
        input.close();
        System.out.println(name.getClass());
    }
}
