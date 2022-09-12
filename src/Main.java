import java.util.Scanner;

public class Main
{
    static int antalPersoner;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); // tilføjer scanner så bruger kan indtaste antal personer
        System.out.print("Indtast hvor mange personer du skal bage kage til: ");
        antalPersoner = sc.nextInt(); // modtager antal personer

        System.out.println("\nSandkage til " + antalPersoner + " person(er)"); // informere brugeren om kagen og pers.
        System.out.println("Ingredienser:");

        Opskrifter sandkage = new Opskrifter();
        sandkage.getNavn("Sandkage");
    }
}