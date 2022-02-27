
package lesschtroumpfs;

public class Schtroumpf {
	
	private String nom;
	private int age;
	private boolean etat;
	private Village habitat;
	
	public Schtroumpf(String pfNom, int pfAge) {
		this.nom = pfNom;
		this.age = pfAge;
		
		this.habitat = null;
	}
	
	public Schtroumpf(String pfNom, int pfAge, Village pfVillage) {
		this.nom = pfNom;
		this.age = pfAge;
		this.habitat = pfVillage;
		
	}
	
	/*Retourne le nom d'un schtroumpf
	 * 
	 */
	public String getNom() {
		return this.nom;
	}
	
	/*Retourne l'age d'un schtroumpf
	 * 
	 */
	public int getAge() {
		return this.age;
	}
	
	/* Retourne l'�tat du schtroumpf (true s'il est content, false sinon)
	 * 
	 */
	public boolean estContent() {
		return this.etat;
	}
	
	public String toString() {
		
		if (this.estContent() == true) {
			if(this.habitat != null) {
				return "Je suis" + " " + this.nom + "," + " " + "j'ai" + " " + this.age + " " + "ans et je suis content." + " " + "Nom de mon village :" + " " + this.habitat.getNom();
			}
			else {
				return "Je suis" + " " + this.nom + "," + " " + "j'ai" + " " + this.age + " " + "ans et je suis content." + " " + "Je suis ermite.";
			}
		}
		
		else{
			if(this.habitat != null) {
				return "Je suis" + " " + this.nom + "," + " " + "j'ai" + " " + this.age + " " + "ans et je suis PAS content." + " " + "Nom de mon village :" + " " + this.habitat.getNom();
			}
			else {
				return "Je suis" + " " + this.nom + "," + " " + "j'ai" + " " + this.age + " " + "ans et je suis PAS content." + " " + "Je suis ermite";

			}
		}
	}
	
	public void sePresenter() {
		System.out.println(this.toString());
	}
	
	public String leChant() {
		if (this.estContent() == true) {
			return "la, la, la Schtroumpf la, la";
		}
		return ("gloups");
	}
	
	public void chanter() {
		System.out.println(this.leChant());
	}
	
	public void anniversaire() {
		this.age += 1;
	}
	
	public void manger(int pfQte) {
		if(pfQte > 0) {
			this.etat = true;
		}
	}
		public void allerTravailler() {
			this.etat = false; 
		}
		
		public Village getVillage() {
			return this.habitat;
		}
		
		public void setVillage(Village pfV) {
			this.habitat = pfV;
		}
		
		public void recolterSalsepareille() {
			if(this.habitat == null) {
				this.manger(5);
			}
			else {
				int quantite = this.habitat.getStockSalsepareille();
				quantite += 5;
				this.etat = false;
			}
		}
		
		public void dinerAuVillage() {
			if(this.habitat == null) {
				this.etat = false;
			}
			else {
				int quantite = this.habitat.getStockSalsepareille();
				quantite -= 3;
				this.etat = true;
			}
		}
	}

