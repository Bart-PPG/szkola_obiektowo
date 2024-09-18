public class Main {
    public static void main(String[] args) {
        Osoba osobaJas = new Osoba("Jaś","Śliweczka",7);

        //niezgodne z regula hermetyzacji
        System.out.println(osobaJas.imie);
        System.out.println(osobaJas.nazwisko);
        osobaJas.imie = "Janke";
        System.out.println(osobaJas.imie);
        //hermetyzacja
        //powinno byc tak zeby program nie mogl zmieniac wlasnosci klas

    }
}