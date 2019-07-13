/**
* Main.java
*
* Oppgave 11.10.3
*
* Program som sammenligner bøker.
*/

public class Main {
    public static void main(String[] args) {
        Bok bok1 = new Bok("The Lord of the Rings - The Fellowship of the Ring", "J. R. R. Tolkien",
                            1954, 423, "George Allen & Unwin");

        Bok bok2 = new Bok("The Lord of the Rings - The Two Towers", "J. R. R. Tolkien",
                1954, 352, "George Allen & Unwin");

        Bok bok3 = new Bok("The Lord of the Rings - The Return of the King", "J. R. R. Tolkien",
                1955, 416, "George Allen & Unwin");

        Bok bok4 = new Bok("Programmering i Java 4. Utgave", "Else Lervik & Vegard B. Havdal",
                2017, 956, "Gyldendal");


        BokSammenligner bokSammenligner = new BokSammenligner();
        System.out.println(bokSammenligner.sammenlign(bok1, bok2));
        System.out.println("\n");
        System.out.println(bokSammenligner.sammenlign(bok1, bok3));
        System.out.println("\n");
        System.out.println(bokSammenligner.sammenlign(bok1, bok4));
    }
}
