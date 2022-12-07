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
	
	public DPartie getPartie(){
		return partie;
	}
	
	
	public static ImageIcon getIcon(EtatCase ec,int nbMine){
		switch (ec) {
		case INCONNUE:return new ImageIcon(repertoire+"/Inconnue.GIF");
		case DRAPEAU:return new ImageIcon(repertoire+"/Drapeau.GIF");
		case MINE:return new ImageIcon(repertoire+"/Mine.GIF");
		case CROIX:return new ImageIcon(repertoire+"/Croix.GIF");
		case VIDE: return new ImageIcon(repertoire+"/Vide.GIF");
		case DECOUVERTE: return new ImageIcon(repertoire+"/"+nbMine+".GIF");	
		default : return new ImageIcon(repertoire+"/Select.GIF");
	}
	
	}
	
	
}