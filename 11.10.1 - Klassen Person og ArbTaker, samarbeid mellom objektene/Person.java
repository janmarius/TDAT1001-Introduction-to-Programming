/**
* Person.java
*
* Oppgave 11.10.1
*
* Klassen Person
*/

public class Person {
	private String fornavn;
	private String etternavn;
	private int f�dsels�r;


	public Person(String fornavn, String etternavn, int f�dsels�r) {
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.f�dsels�r = f�dsels�r;
	}


	public String getFornavn() {
		return fornavn;
	}


	public String getEtternavn() {
		return etternavn;
	}


	public int getF�dsels�r() {
		return f�dsels�r;
	}


	public String toString() {
		return "Fornavn: " + fornavn + " Etternavn: " + etternavn + " F�dsels�r: " + f�dsels�r;
	}
}
