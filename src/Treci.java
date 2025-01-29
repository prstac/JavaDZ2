public class Treci {
    public static void main(String[] args) {

        // Kreirati uvjet koji sipisuje poruku 'Broj x je paran' odnosno 'Broj X je neparan"
        // Ispisati za prvih 20 brojeva jesu parni ili neparan

        for (int x = 1; x < 21; x++) {
            System.out.printf("Broj %d je ", x);
            if ((x & 1) == 0)  {
                System.out.println("paran");
            } else {
                System.out.println("neparan");
            }
        }
        System.out.println();

        // Ispisati poruku ovisno  o unesenom spolu, ako je unesen znak "m" ispisati poruku "Korisnik je muška osoba",
        // ako je unesen znak "Ž" korisnik je ženska osoba
        // proširiti sa else if ako spol nije prepoznat.
        char osoba = 'M';
        if (osoba == 'M') {
            System.out.println("Korisnik je muška osoba.");
        }
        else if (osoba == 'Ž') {
            System.out.println("Korisnik je ženska osoba.");
        } else {
            System.out.println("Nepoznat unos");
        }

        // Kreiraj kod koji ce ispisati ocjene dovoljan do nedovoljan ovisno o unesenom broju
        int broj = 10;
        if (broj == 1) {
            System.out.println("Nažalost ocjena je nedovoljan!");
        } else if (broj == 2) {
            System.out.println("Nažalost ocjena je dovoljan!");
        } else if (broj == 3) {
            System.out.println("Ocjena je dobar!");
        } else if (broj == 4) {
            System.out.println("Ocjena je vrlo dobar!");
        } else if (broj == 5) {
            System.out.println("Ocjena je odličan!!");
        } else {
            System.out.println("Ocjena ne postoji!");
        }

        System.out.println();

        // prepiši s switch case
        broj = -1;
        switch (broj) {
            case 1:
                System.out.println("Nažalost ocjena je nedovoljan!");
                break;
            case 2:
                System.out.println("Nažalost ocjena je dovoljan!");
                break;
            case 3:
                System.out.println("Ocjena je dobar!");
                break;
            case 4:
                System.out.println("Ocjena je vrlo dobar!");
                break;
            case 5:
                System.out.println("Ocjena je odličan!!");
                break;
            default:
                System.out.println("Ocjena ne postoji!");
                break;
        }


        System.out.println();
        // grupiranje case
        broj =  2;
        switch (broj) {
            case 1:
            case 3:
            case 5:
                System.out.printf("Broj %s je neparan!\n", broj);
                break;
            case 2:
            case 4:
                System.out.printf("Broj %s je paran!\n", broj);
                break;
            default:
                System.out.println("Nepoznato");
                break;
        }

        // ternarni operator
        int a = 3;
        int b = 6;
        int c = 4;
        c = a > b ? a : b;
        System.out.println(c);
    }
}
