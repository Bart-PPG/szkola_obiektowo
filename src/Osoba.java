public class Osoba {
    String imie;
    String nazwisko;
    int wiek;

    //konstruktor to metoda wywoływana w momencie tworzenia obiektu

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        //przypisz do wlasnosci klasy imie (this wskazuje ne ten )
        //imie ktore jest parametrem
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }
}
