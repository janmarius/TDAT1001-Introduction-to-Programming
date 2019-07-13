/**
* Student.java
*
* Oppgave 12.10.1
*
* Klassen Student
*/


public class Student {
    private String navn;
    private int antOppg;

    public Student(String navn, int antOppg) {
        this.navn = navn;
        this.antOppg = antOppg;
    }

    public String getNavn() {
        return navn;
    }

    public int getAntOppg() {
        return antOppg;
    }

    public void økAntOppg(int økning) {
        antOppg += økning;
    }

    public String toString() {
        return "Navn: " + navn + "\nAntall oppgaver: " + antOppg;
    }


    public static void main(String[] args) {
        Student student1 = new Student("Per", 1);
        System.out.println("getNavn(): " + student1.getNavn());
        System.out.println("getAntOppg(): " + student1.getAntOppg());
        student1.økAntOppg(2);
        System.out.println("getAntOppg() etter økning: " + student1.getAntOppg());
        System.out.println(student1.toString());
    }
}