package test;

import lesschtroumpfs.Schtroumpf;

public class MainSchtroumpf {

	public static void main (String[] argv) {
		Schtroumpf grognon = new Schtroumpf("Grognon", 35);
		grognon.sePresenter();
		grognon.chanter();
		grognon.allerTravailler();
		grognon.sePresenter();
		grognon.chanter();
		grognon.manger(10);
		grognon.sePresenter();
		grognon.chanter();
		grognon.anniversaire();
		grognon.sePresenter();
		grognon.chanter();	
	}

}
