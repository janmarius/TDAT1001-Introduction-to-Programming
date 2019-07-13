/**
* Temperaturer.java
*
* Oppgave 9.11.2
*
* Klassen Temperaturer
*/

import static javax.swing.JOptionPane.*;

class Temperaturer {
	private double[][] temperaturer;
	private String måned;

	public Temperaturer(String måned, int antallDager) {
		this.måned = måned;
		temperaturer = new double[antallDager][4];
	}


	public String getMåned() {
		return måned;
	}


	public int finnAntallDager() {
		return temperaturer.length;
	}

	public int finnAntallTimer() {
		return temperaturer[0].length;
	}


	public void setTemperaturer(int dag, int time, double temp) {
		temperaturer[dag][time] = temp;
	}


	public void finnMiddelTempPerDag() {
		double totSum = 0;
		double middelTemp = 0;


		for (int i = 0; i < temperaturer.length; i++) {
			for (int j = 0; j < temperaturer[i].length; j++) {
				totSum += temperaturer[i][j];
			}
			middelTemp = totSum / temperaturer[i].length;
			System.out.println("Dag: " + (i + 1) + " har middeltemperaturen " + middelTemp);
			totSum = 0;
			middelTemp = 0;
		}
	}


	public void finnMiddelTempPerTime() {
		double totSum = 0;
		double middelTemp = 0;

		for (int i = 0; i < finnAntallTimer(); i++) {
			for (int j = 0; j < temperaturer.length; j++) {
				totSum += temperaturer[j][i];
			}
			middelTemp = totSum / temperaturer.length;
			System.out.println("Time: " + (i + 1) + " har middeltemperaturen " + middelTemp);
			totSum = 0;
			middelTemp = 0;
		}
	}


	public void finnMiddelTempHeleMåned() {
		double totSum = 0;
		double middelTemp = 0;
		int gruppe1 = 0;
		int gruppe2 = 0;
		int gruppe3 = 0;
		int gruppe4 = 0;
		int gruppe5 = 0;
		int gruppe6 = 0;


		for (int i = 0; i < temperaturer.length; i++) {
			for (int j = 0; j < temperaturer[i].length; j++) {
				totSum += temperaturer[i][j];
			}
			middelTemp = totSum / temperaturer[i].length;
			if (middelTemp < -5) {
				gruppe1++;
			} else if (middelTemp >= -5 && middelTemp < 0) {
				gruppe2++;
			} else if (middelTemp == 0) {
				gruppe3++;
			} else if (middelTemp <= 5 && middelTemp > 0) {
				gruppe4++;
			} else if (middelTemp > 5 && middelTemp <= 10) {
				gruppe5++;
			} else {
				gruppe6++;
			}
			totSum = 0;
			middelTemp = 0;
		}
		System.out.println("Mindre enn -5 grader: " + gruppe1 + "\n" +
						   "Mellom -5 og 0 grader: " + gruppe2 + "\n" +
						   "0 grader: " + gruppe3 + "\n" +
						   "Mellom 0 og 5 grader: " + gruppe4 + "\n" +
						   "Mellom 5 og 10 grader: " + gruppe5 + "\n" +
						   "Over 10 grader: " + gruppe6);
	}


	public void finnMiddelTempGrupper() {
		double totSum = 0;
		double middelTemp = 0;

		for (int i = 0; i < finnAntallTimer(); i++) {
			for (int j = 0; j < temperaturer.length; j++) {
				totSum += temperaturer[j][i];
			}
			middelTemp = totSum / temperaturer.length;
			System.out.println("Time: " + (i + 1) + " har middeltemperaturen " + middelTemp);
			totSum = 0;
			middelTemp = 0;
		}
	}


	public String toString() {
		String res = "";
		for (int i = 0; i < temperaturer.length; i++) {
			for (int j = 0; j < temperaturer[i].length; j++) {
				res += "Dag " + (i + 1) + " time " + (j + 1) + ": " + temperaturer[i][j] + "\n";
			}
			res += "\n";
		}
		return res;
	}


	public static void main(String[] args) {
		Temperaturer temperaturer = new Temperaturer("Januar", 3);

		System.out.println("Måneden er: " + temperaturer.getMåned());
		System.out.println();


		for (int i = 0; i < temperaturer.finnAntallDager(); i++) {
			for (int j = 0; j < temperaturer.finnAntallTimer(); j++) {
				String tempLest = showInputDialog("Hva er temperaturen for dag " + (1 + i) + " time " + (1 + j));
				double temp = Double.parseDouble(tempLest);
				temperaturer.setTemperaturer(i, j, temp);
			}
		}

		System.out.println(temperaturer.toString());
		temperaturer.finnMiddelTempPerDag();

		System.out.println();
		temperaturer.finnMiddelTempPerTime();

		System.out.println();
		temperaturer.finnMiddelTempHeleMåned();
	}
}