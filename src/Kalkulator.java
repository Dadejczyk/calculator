import java.util.Scanner;

public class Kalkulator
{
    public static int dodaj(int a, int b)
    {
        return a + b;
    }
    public static int odejmij(int a, int b)
    {
        return a - b;
    }
    public static int pomnoż(int a, int b)
    {
        return a * b;
    }
    public static int podziel(int a, int b)
    {
        return a / b;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);


        while (true)
        {
            System.out.println("Liczba pierwsza: ");
            int liczbaPierwsza = scanner.nextInt();

            System.out.println("Wybierz operację");
            System.out.println(" ");
            System.out.println("1. Dodawanie");
            System.out.println("2. Odejmowanie");
            System.out.println("3. Mnożenie");
            System.out.println("4. Dzielenie");
            System.out.println("5. Wyjście");
            System.out.println("6. Wynik ");

            System.out.print("Twój wybór: ");
            int wybor = scanner.nextInt();

            if (wybor == 5)
            {
                System.out.println("CHUJ CI W DUPĘ I DWA WIADRA");
                break;
            }


            System.out.println("Podaj liczbę drugą: ");
            int liczbaDruga = scanner.nextInt();




           if (wybor == 1)
            {
                System.out.println("Wynik Dodawania to: " + dodaj(liczbaPierwsza, liczbaDruga));
            }
            else if (wybor == 2)
            {
                System.out.println("Wynik Odejmowania to: " + odejmij(liczbaPierwsza,liczbaDruga));
            }
            else if (wybor == 3)
            {
                System.out.println("Wynik Mnożenia to: " + pomnoż(liczbaPierwsza,liczbaDruga));
            }
            else if (wybor == 4)
            {
                System.out.println("Wynik Dzielenia to: " + podziel(liczbaPierwsza,liczbaDruga));
            }
            else
            {
                System.out.println("Masz podane liczby fiutku ;-)");
                break;
            }
        }
    }
}
