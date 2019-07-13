/**
* Spiller.java
*
* Oppgave 5.9.3
*
* Klassen Spiller
*/

import java.util.Random;

class Spiller {
	private String navn;
	private int sumPoeng = 0;

	public Spiller(String navn) {
		this.navn = navn;
	}

	public String getNavn() {
		return navn;
	}

	public int getSumPoeng() {
		return sumPoeng;
	}

	public void setSumPoeng(int sumPoeng) {
		this.sumPoeng = sumPoeng;
	}


	public int kastTerning() {
		Random terning = new Random();
		int terningVerdi = terning.nextInt(6);
		terningVerdi++;
		if (terningVerdi != 1) {
			sumPoeng += terningVerdi;
		} else {
			sumPoeng = 0;
		}
		return terningVerdi;
	}






}