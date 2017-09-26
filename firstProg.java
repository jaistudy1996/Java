
public class firstProg{
    public static void main( String[] args ){
        // This is a simple comment that I only the developer can see
        // This is not compiled to the main program.
        System.out.println("Hello world");
        System.out.println("hello again\n");
        System.out.println("This is a print!");
        System.out.println("I'm not new to \"this\"");

        letter();
    }

    public static void letter(){
        System.out.println("+---------------------------------------------------------------+");
        for(int i=0; i<3; i++){
            System.out.println("|                                                           ### |");
        }
        for(int i=0; i<3; i++){
            System.out.println("|                                                               |");
        }
        System.out.println("|                                        Bill Gates             |");
        System.out.println("|                                   1 Microsoft Way             |");
        System.out.println("|                                 Redmond, WA 98104             |");
        System.out.println("|                                                               |");
        System.out.println("+---------------------------------------------------------------+");
    }
}