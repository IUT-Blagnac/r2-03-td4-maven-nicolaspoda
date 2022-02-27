package test;

import lesschtroumpfs.Schtroumpf;
import lesschtroumpfs.Village;

public class MainVillage {

	public static void main (String[] argv) {
		String[] nomsSchtroumpfs = {
		        "Grand Schtroumpf", "Schtroumpf courant (et pas ordinaire)", "Schtroumpf ordinaire (et pas courant)", "Schtroumpf moralisateur � lunettes",
		        "Schtroumpf boudeur", "Schtroumpf volant", "Schtroumpf étonné", "Schtroumpf acrobate", "Schtroumpf paresseux"
		};
		
		Village monVillage = new Village("Village des schtroumpfs", 10, nomsSchtroumpfs);
		monVillage.solstice_d_ete();
		Schtroumpf leChef = monVillage.chefDuVillage();
		System.out.println("Pr�sentation du chef :");
		leChef.sePresenter();
		monVillage.envoyerAuTravail();
		System.out.println("Affichage des schtroumpfs heureux :");
		monVillage.schtroumpfsHeureux();
		monVillage.envoyerCueillirSalsepareille();
		System.out.println("Solstice d'été après la cueillette:");
		monVillage.solstice_d_ete();
		monVillage.dinerTousEnsemble();
		System.out.println("Solstice d'été après le diner:");
		monVillage.solstice_d_ete();
	}
	
	
}
