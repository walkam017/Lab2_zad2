import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            //tworzenie instancji klasy Scanner oraz obiektu klasy Scanner, argument System.in
            Scanner scanner = new Scanner(System.in);

            //konwersja z double na int
            System.out.println(" Podaj liczbe double");
            // deklaracja zmiennej String imie i wczytanie wprowadzoneego tekstu do tej zmiennej
            double aDouble = scanner.nextDouble();
            int calkowita = (int) aDouble;
            // wyswietlenie
            System.out.println("Przekonwersowana liczba z double na int " + calkowita  );



            //konwersja z int na double
            System.out.println(" Podaj liczbe calkowita");
            // deklaracja zmiennej całlkowitoliczbowej int
            int LiczbaCalk = scanner.nextInt();
            double liczbaDouble = (double) LiczbaCalk;
            System.out.println("Przekonwersowana liczba z int na double " + liczbaDouble  );

            //konwersja z char na int
            System.out.println("Podaj liczbe char");
            char character = scanner.next().charAt(0);
            int c = (int) character;
            System.out.println(" Przekonwertowana liczba z char na int  " + c );

            // konwersja z boolean na string
            System.out.println(" Podaj znak boolean ");
            boolean bool = scanner.nextBoolean();
            String znak = Boolean.toString(bool);
            System.out.println(" Wynik boolean " + znak);

            scanner.close();


        }
    }
