public class Petlje {
    public static void main(String[] args) {
        // Zelimo ispisati prvih 15 brojeva
        int i = 0;
        System.out.println();
        while (++i < 16) System.out.printf("Broj %s\n", i);

        System.out.println();
        i = 17;
        do {
            System.out.println("Broj " + i);
            i++;
        } while (i < 16);

        System.out.println();

        // pomocu do while izracunati zbroj prvih x brojeva
        int zbroj = 0;
        int x = 5;
        int trenutniBroj = 1;
        do {
            zbroj += trenutniBroj;
            trenutniBroj++;
        } while (trenutniBroj < x + 1);
        System.out.printf("Zbroj prvih %s brojeva je %s\n", x ,zbroj);



        // pomocu do while izracunati zbroj prvih x brojeva
        zbroj = 0;
        trenutniBroj = 1;
        do {
            zbroj += trenutniBroj;
        } while (trenutniBroj++ < x );
        System.out.printf("Zbroj prvih %s brojeva je %s\n", x ,zbroj);

        var suma = 0;
        for (int j = 0; j < x + 1; j++) {
            suma += j;
        }
        System.out.printf("Zbroj prvih %s brojeva je %s\n", x ,suma);


        int y = 1;
        for (int j = 0; j < 10; j++) {
            System.out.println(y);
        }

        System.out.println();

        // Prikazati ispis da izgleda u Obliku "Broj Y 1.puta", "Broj Y 2.puta"
        for (int j = 0; j < 10; j++) {
            System.out.printf("Broj %s %s. puta\n", y, j + 1);
        }


        // DOMACI RAD :
        // Domaći rad
        // Korištenjem petlje while -> Izračunaj zbroj znamenaka unesenog broja. Npr 351 zbroj znamenaka je 9.
        // Korištenjem petlje do while izračunaj zbroj brojeva od 1 do 1000 djeljivih sa 7.

        // https://github.com/DinkoSul/27_1_2025/tree/main/src (na kraju i petlje.java)

        System.out.println();
        System.out.println("PRVI ZADATAK");
        var uneseniBroj = 12345;
        var broj = uneseniBroj;
        var zbrojZnamenaka =0;
        while(broj > 0) {
            var znamenka = broj % 10;
            broj = broj / 10;
            zbrojZnamenaka += znamenka;
        }
        System.out.println("Zbroj zanmenaka broja "+uneseniBroj+" je "+zbrojZnamenaka);

        System.out.println();
        System.out.println("DRUGI ZADATAK");
        int pocetak = 1;
        int kraj = 1000;
        trenutniBroj = kraj;
        zbroj = 0;
        do {
            System.out.println(trenutniBroj);
            if (trenutniBroj % 7 == 0) {
                zbroj+=trenutniBroj;
            }
        } while (trenutniBroj-- > pocetak);
        System.out.println("Zbroj brojeva djeljivh sa 7 izmedju " + pocetak + " i " + kraj + " je = "+zbroj);
    }
}
