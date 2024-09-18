public class Main {
    public static void main(String[] args) {
        Osoba osobaJas = new Osoba("Jaś","Śliweczka",10);
        //wywoluje konstruktor klasy osoba
        System.out.println(osobaJas.getImie());
        System.out.println(osobaJas.getNazwisko());
        osobaJas.setImie("Jan");
        System.out.println(osobaJas.getImie());

        Osoba osobaAla = new Osoba("Ala","Fala");
        System.out.println(osobaJas.getWiek());
        System.out.println(osobaAla.getWiek());

        Osoba osobaX = new Osoba();

        System.out.println(osobaJas);

        System.out.println("Liczba uczniow"+Uczen.liczbaObiektow);
        Uczen uczen = new Uczen("Daniel","Nowy");
        System.out.println("Liczba uczniow"+Uczen.liczbaObiektow);
        Uczen uczen2 = new Uczen("Daniel","Nowa");
        System.out.println("Liczba uczniow"+Uczen.liczbaObiektow);
        Uczen uczen3 = new Uczen("Danielo","Stary");
        System.out.println("Liczba uczniow"+Uczen.liczbaObiektow);
        System.out.println(uczen3);

            Nauczyciel nauczycielSlowik = new Nauczyciel("Marlena","Slowik", 30,"Matematyka");
        System.out.println(nauczycielSlowik);

    }
}