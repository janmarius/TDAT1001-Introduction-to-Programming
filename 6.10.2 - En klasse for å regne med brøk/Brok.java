/**
* Brok.java
*
* Oppgave 6.10.2
*
* En klasse for å regne med brøk
*/


import static javax.swing.JOptionPane.*;

class Brok {
	private int teller;
	private int nevner;

	public Brok(int teller, int nevner) {
		this.teller = teller;
		if (nevner == 0) {
			throw new IllegalArgumentException("Nevner kan ikke være 0!");
		} else {
			this.nevner = nevner;
		}
	}

	public Brok(int teller) {
		this.teller = teller;
		nevner = 1;
	}

	public int getTeller() {
		return teller;
	}

	public int getNevner() {
		return nevner;
	}


	public void summer(int teller, int nevner) {
		if (nevner == 0) {
			throw new IllegalArgumentException("Nevner kan ikke være 0!");
		} else {
			this.teller = (this.nevner * teller) + (nevner * this.teller);
			this.nevner *= nevner;
		}
	}

	public void subtraher(int teller, int nevner) {
		if (nevner == 0) {
			throw new IllegalArgumentException("Nevner kan ikke være 0!");
		} else {
			this.teller = (nevner * this.teller) - (this.nevner * teller);
			this.nevner *= nevner;
		}
	}

	public void multipliser(int teller, int nevner) {
		if (nevner == 0) {
			throw new IllegalArgumentException("Nevner kan ikke være 0!");
		} else {
			this.teller *= teller;
			this.nevner *= nevner;
		}
	}

	public void divider(int teller, int nevner) {
		if (nevner == 0) {
			throw new IllegalArgumentException("Nevner kan ikke være 0!");
		} else {
			this.teller *= nevner;
			this.nevner *= teller;
		}
	}

	private void forkort(int teller, int nevner) {
		if (teller > nevner) {
			for(int i = teller; i > 0; i--) {
				if((teller % i == 0) && (nevner % i == 0)) {
					teller /= i;
					nevner /= i;
				}
			}
		} else if (teller < nevner) {
			for(int i = nevner; i > 0; i--) {
				if((teller % i == 0) && (nevner % i == 0)) {
					teller /= i;
					nevner /= i;
				}
			}
		} else {
			for(int i = teller; i > 0; i--) {
				if((teller % i == 0) && (nevner % i == 0)) {
					teller /= i;
					nevner /= i;
				}
			}
		}
		this.teller = teller;
		this.nevner = nevner;
	}




	public static void main(String[] args) {
		//Oppretter brøk 1 og 2
		String tellerBrok1Lest = showInputDialog("Teller Brøk 1: ");
		String nevnerBrok1Lest = showInputDialog("Nevner Brøk 1: ");
		String tellerBrok2Lest = showInputDialog("Teller Brøk 2: ");
		String nevnerBrok2Lest = showInputDialog("Nevner Brøk 2: ");
		int tellerBrok1 = Integer.parseInt(tellerBrok1Lest);
		int nevnerBrok1 = Integer.parseInt(nevnerBrok1Lest);
		int tellerBrok2 = Integer.parseInt(tellerBrok2Lest);
		int nevnerBrok2 = Integer.parseInt(nevnerBrok2Lest);

		try {
			Brok brok = new Brok(tellerBrok1, nevnerBrok1);
			brok.summer(tellerBrok2, nevnerBrok2);
			brok.forkort(brok.getTeller(), brok.getNevner());
			showMessageDialog(null, tellerBrok1 + "/" + nevnerBrok1 + " + " + tellerBrok2 + "/" + nevnerBrok2 + " = " + brok.getTeller() + "/" + brok.getNevner());


			brok = new Brok(tellerBrok1, nevnerBrok1);
			brok.subtraher(tellerBrok2, nevnerBrok2);
			brok.forkort(brok.getTeller(), brok.getNevner());
			showMessageDialog(null, tellerBrok1 + "/" + nevnerBrok1 + " - " + tellerBrok2 + "/" + nevnerBrok2 + " = " + brok.getTeller() + "/" + brok.getNevner());

			brok = new Brok(tellerBrok1, nevnerBrok1);
			brok.multipliser(tellerBrok2, nevnerBrok2);
			brok.forkort(brok.getTeller(), brok.getNevner());
			showMessageDialog(null, tellerBrok1 + "/" + nevnerBrok1 + " * " + tellerBrok2 + "/" + nevnerBrok2 + " = " + brok.getTeller() + "/" + brok.getNevner());

			brok = new Brok(tellerBrok1, nevnerBrok1);
			brok.divider(tellerBrok2, nevnerBrok2);
			brok.forkort(brok.getTeller(), brok.getNevner());
			showMessageDialog(null, tellerBrok1 + "/" + nevnerBrok1 + " / " + tellerBrok2 + "/" + nevnerBrok2 + " = " + brok.getTeller() + "/" + brok.getNevner());
		} catch (IllegalArgumentException e) {
			showMessageDialog(null, e);
		}
	}

}


