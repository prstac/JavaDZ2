//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // PRIMITIVNI TIPOVI


        // cjelobrojni tipovi
        // deklariranje varijabli
        byte a3;
        short x = 2; // definicija varijable
        int myWidth2;
        long myHeight;

        // inicijalizacija
        myWidth2 = 5252;

        System.out.println(x + myWidth2);
        System.out.println(x - myWidth2);
        System.out.println(x * myWidth2);
        System.out.println(x / myWidth2); // cjelobrojno dijeljenje
        System.out.println(x % myWidth2); // rezultat ostatak;

        // decimalni tipovi
        float f1 = 3.12323F; // brojF
        double d2 = 3.12323;
        System.out.println((double)x / myWidth2); // decimalno dijeljenje
        System.out.println((float)x / myWidth2); // decomalno s manje znamenki

        System.out.println();


        System.out.printf("3.12323F / 3.12323 %s \n", 3.12323F / 3.12323);
        System.out.printf("3.12323 / 3.12323F %s \n", 3.12323 / 3.12323F);

        //System.out.printf("%d", 3.12323F / 3.12323);
        System.out.printf("3.12323F / 3.12323 = %f \n", 3.12323F / 3.12323);

        //System.out.printf("%d", 3.12323 / 3.12323F);
        System.out.printf("3.12323 / 3.12323F = %f \n", 3.12323 / 3.12323F);

        //System.out.printf("%d", 3 / 3.12323);
        System.out.printf("3 / 3.12323 = %f \n", 3 / 3.12323);

        System.out.printf("3.12323 / 3 = %f \n", 3.12323 / 3);
        //System.out.printf("%d", 3.12323 / 3);

        System.out.printf("(int)(3.12323 / 3) = %d \n", (int)(3.12323 / 3));
        //System.out.printf("%f", (int)(3.12323 / 3));

        //System.out.printf("%f", 20000 / 5252 );
        System.out.printf("20000 / 5252 = %d \n", 20000 / 5252 );

        // deklaracija i definicija znakovnog tipa
        char znak = '\u0041'; /// unicode (2B) // jednostruki navodnici za char
        char znak2 = 'A'; /// unicode (2B) // jednostruki navodnici za char
        System.out.println("char tip podatka: " + znak);
        System.out.println("char tip podatka2: " + znak2);
        System.out.printf("znak == znak2: %s\n", znak2 == znak);
        System.out.printf("znak + znak2: %s\n", znak2 + znak);

        int baze = 5;
        int algoritmi = 4;
        int praktikum = 3;
        int osnove = 3;
        double prosjek = (double)(baze + algoritmi + praktikum + osnove)/4;
        double prosjekBezDouble = (baze + algoritmi + praktikum + osnove)/4;
        System.out.println("Prosjek je " + prosjek); // 3.75
        System.out.println("Prosjek bez castanja " + prosjekBezDouble); // gubitak decimala , rez int 3 -> double 3.0

        System.out.println("Zaokruzen prosjek " + Math.round(prosjek));
        System.out.println("konstanta PI = " + Math.PI);
        System.out.println("konstanta E = " + Math.E);
        System.out.println("korijen iz 2 = " + Math.sqrt(2));
        System.out.println("2^2 = " + Math.pow(2,2));


        // ZADATAK
        System.out.println();
        System.out.println("ZADATAK:");
        System.out.println("10^3 = " + Math.pow(10,3));
        System.out.println("zaokruzi E = " + Math.round(Math.E));
        System.out.println("korijen od 400 = " + Math.sqrt(400));
        System.out.println("e na dvije decimale =" + Math.round(Math.E*100.0)/100.0);

        System.out.println();
        System.out.println("ZADATAK1:");
        var x1 = 1.0f;
        var x2 = 2.1f;
        System.out.printf("Zbroj broja %s + %s = %s\n", x1, x2, x1+x2);
        System.out.println();
        System.out.println("ZADATAK2:");
        var ime = "Ivan";
        var prezime = "Horvat";
        var mjesto = "Zagreb";
        System.out.printf("%s\t%s\n\n%s", ime, prezime, mjesto);

        System.out.printf("\n\n");
        System.out.println("ZADATAK3:");
        var a = 1;
        var b = 2;
        var c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.printf("\nAko su katetete %s i %s hipotenuza je %s", a ,b, c);
    }
}