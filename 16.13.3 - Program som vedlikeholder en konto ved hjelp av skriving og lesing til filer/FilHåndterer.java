/**
* FilHåndterer.java
*
* Oppgave 16.13.3
*
* Klassen FilHåndterer
*/

import java.io.*;

public class FilHåndterer {

    public double lesSaldoFraFil() throws IOException {
        // Oppretter et filobjekt.
        File file = new File("saldo.txt");
        if (file.length() == 0) return Double.MAX_VALUE;

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String saldoLest = bufferedReader.readLine();
        bufferedReader.close();
        fileReader.close();

        double saldo = Double.parseDouble(saldoLest);
        return saldo;
    }


    public void skrivSaldoTilFil(double saldo) throws IOException {
        // Oppretter et filobjekt.
        File file = new File("saldo.txt");

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        PrintWriter printWriter = new PrintWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(printWriter);
        String saldoString = "" + saldo;
        bufferedWriter.write(saldoString);
        bufferedWriter.close();
        printWriter.close();
        fileOutputStream.close();
    }

    public String lesTransaksjonerFraFil() throws IOException {
        // Oppretter et filobjekt.
        File file = new File("transaksjoner.txt");

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String transaksjonLest = bufferedReader.readLine();

        String resultat = "";
        while (transaksjonLest != null) {
            resultat += transaksjonLest;
            transaksjonLest = bufferedReader.readLine();
            if (transaksjonLest != null) {
                resultat += "\n";
            }
        }
        bufferedReader.close();
        fileReader.close();
        return resultat;
    }


    public double lesSumTransaksjonerFraFil() throws IOException {
        // Oppretter et filobjekt.
        File file = new File("transaksjoner.txt");
        if (file.length() == 0) return Double.MAX_VALUE;

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String transaksjonLest = bufferedReader.readLine();

        double sum = 0;
        while (transaksjonLest != null) {
            char type = transaksjonLest.charAt(0);
            if (type == 'I') {
                String beløpLest = transaksjonLest.substring(2);
                double beløp = Double.parseDouble(beløpLest);
                sum += beløp;
            } else if (type == 'U') {
                String beløpLest = transaksjonLest.substring(2);
                double beløp = Double.parseDouble(beløpLest);
                sum -= beløp;
            }
            transaksjonLest = bufferedReader.readLine();
        }
        bufferedReader.close();
        fileReader.close();
        return sum;
    }


    public void skrivTransaksjonTilFil(double beløp) throws IOException {
        // Oppretter et filobjekt.
        File file = new File("transaksjoner.txt");

        boolean append = true;
        FileOutputStream fileOutputStream = new FileOutputStream(file, append);
        PrintWriter printWriter = new PrintWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(printWriter);
        String beløpString;
        if (beløp < 0) {
            beløpString = "U " + Math.abs(beløp);
        } else {
            beløpString = "I " + beløp;
        }
        if (file.length() != 0) {
            bufferedWriter.newLine();
        }
        bufferedWriter.write(beløpString);
        bufferedWriter.close();
        printWriter.close();
        fileOutputStream.close();
    }


    public void tømTransaksjoner() throws IOException {
        PrintWriter printWriter = new PrintWriter("transaksjoner.txt");
        printWriter.close();
    }
}