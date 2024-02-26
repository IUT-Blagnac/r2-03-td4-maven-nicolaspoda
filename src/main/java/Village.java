package lesschtroumpfs;


public class Village {
	
	private String nom;
	private Schtroumpf[] tabS;
	private int nbSch;
	private int nbStock;
	
	
	public Village(String pfNomV, int pfStockSalsepareille, String[] pfNomDesSchtroumpfs) {
		this.nom = pfNomV;
		this.nbStock = pfStockSalsepareille;
		
		int taille = pfNomDesSchtroumpfs.length;
		this.tabS = new Schtroumpf[taille];
		for(int i = 0; i<taille;i++) {
			int age = (int)(Math.random()*150);
			this.tabS[i] = new Schtroumpf(pfNomDesSchtroumpfs[i], age, this);
			
			this.nbSch++;
		}
		this.nbSch = taille;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public int getNbSchtroumpf() {
		return this.nbSch;
	}
	
	public int getStockSalsepareille() {
		return this.nbStock;
	}
	
	public void solstice_d_ete() {
		int taille = this.tabS.length;
		for (int i = 0; i<taille;i++) {
			this.tabS[i].sePresenter();
			this.tabS[i].chanter();
		}
		System.out.println("Nom du village :" + " " + this.getNom());
		System.out.println("Nombre de Schtroumpfs presents lors de la fete :"  + " " + this.getNbSchtroumpf());
		int compteur = 0;
		for(int j = 0; j<taille; j++) {
			if (this.tabS[j].estContent() == true) {
				
				compteur++;
			}
		}
		System.out.println("Nombre de Schroumpfs contents ce jour-là :" + " " + compteur);
	}
	
	public Schtroumpf chefDuVillage() {
		Schtroumpf leChef = this.tabS[0];
		int taille = this.tabS.length;
		for(int i=1; i<taille;i++) {
			if(this.tabS[i].getAge() > leChef.getAge()) {
				leChef = this.tabS[i];
			}
		}
		return leChef;
	}
	
	public void envoyerAuTravail() {
		int taille = this.tabS.length;
		Schtroumpf[] pfTab = new Schtroumpf[taille];
		for (int i=0;i<taille;i=i++) {
			for(int j = 0; j<taille; j++) {
				if(this.tabS[i].estContent() == true) {
					
					pfTab[j] = this.tabS[i];
					pfTab[j].recolterSalsepareille();
				
			}
				
			}
			
			
		}
	}
	
	public void schtroumpfsHeureux() {
		int taille = this.tabS.length;
		for (int i = 0; i<taille; i++) {
			if(this.tabS[i].estContent() == true) {
				this.tabS[i].sePresenter();
				this.tabS[i].chanter();
			}
		}
	}
	
	public void dinerTousEnsemble() {
		int taille = this.tabS.length;
		for (int i = 0; i < taille; i++ ) {
			this.tabS[i].dinerAuVillage();
		}
	}
	
	public void envoyerCueillirSalsepareille() {
		int taille = this.tabS.length;
		Schtroumpf[] pfTab = new Schtroumpf[taille];
		int j = 0;
		for (int i=0;i<taille;i=i++) {
				if(this.tabS[i].estContent() == true) {
					
					pfTab[j] = this.tabS[i];
					pfTab[j].recolterSalsepareille();
				
			}
				
			
			
			
		}
	}
}
