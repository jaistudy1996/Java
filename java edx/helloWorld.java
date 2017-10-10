import java.util.Scanner;

public class helloWorld{
    public static void main(String[] args){
        System.out.println("Hello World");
        input();
    }

    public static void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = input.next();
        System.out.println("Hello, " + name);
    }
}
