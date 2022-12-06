import javax.swing.*;

import metier.DPartie;
import metier.EtatCase;

import java.awt.*;

public class DImageur{
	
	private DPartie partie;
	public static String repertoire = "resources/Images/Classic";
	
	public DImageur(DPartie p){
		partie = p;
	}
	
	public static String getRepertoire(){
		return repertoire;
	}
	
	public static void setRepertoire(String s){
		repertoire = s;
	}
	
	public static ImageIcon getIcon(EtatCase ec){
		switch (ec) {
		case INCONNUE:return new ImageIcon(repertoire+"/Inconnue.GIF");
		case DRAPEAU:return new ImageIcon(repertoire+"/Drapeau.GIF");
		case MINE:return new ImageIcon(repertoire+"/Mine.GIF");
		case CROIX:return new ImageIcon(repertoire+"/Croix.GIF");
		case VIDE: return new ImageIcon(repertoire+"/Vide.GIF");
		case DECOUVERTE: return new ImageIcon(repertoire+"/1.GIF");	
		default : return new ImageIcon(repertoire+"/Mine.GIF");
	}
	
		
	}
	
}