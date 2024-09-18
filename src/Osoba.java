import java.util.Scanner;

public class Osoba {
    private String imie;
    private String nazwisko;
    private int wiek;
    //prywatne wartosci sa dostepne tylko w tej klasie

    //konstruktor to metoda wywoływana w momencie tworzenia obiektu

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        //przypisz do wlasnosci klasy imie (this wskazuje ne ten )
        //imie ktore jest parametrem
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }
    //metody dostepowe
    //gettery i settery
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        //wpisywanie hasla z klawiatury
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj haslo do zmiany imienia");
        String haslo = scanner.next();
        //jesli haslo qwe123 to zmien w przciwnym wypadku komunikat
        if(haslo.equals("qwe123")){
            this.imie = imie;
        }
        else {
            System.out.println("nie możemy zmienic imienia");
        }
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
}
