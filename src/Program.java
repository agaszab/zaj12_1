import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class Program {

    public static void main(String[] args) throws FileNotFoundException {


        TreeSet<Integer> liczby = new TreeSet<>();
        int licznik = 0;


        File file = new File("liczby.txt");
        Scanner scan = new Scanner(file);

        while (scan.hasNextInt()) {
            int liczba = scan.nextInt();

            liczby.add(liczba);
            licznik++;
        }

            System.out.println("Ilość liczb zapisanych w pliku: "+licznik);
            System.out.println("Ilość unikalnych liczbliczb "+liczby.size());
            System.out.println("Najmniejsza liczba: "+liczby.first());
            System.out.println("Największa liczba: "+liczby.last());




    }
}