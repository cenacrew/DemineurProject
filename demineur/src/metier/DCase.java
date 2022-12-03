package metier;
public class DCase{
	
	private boolean mine;
	private int mimesAlentour;
	private boolean drapeau;
	private boolean decouverte;
	private boolean selection;
	
	private EtatCase ec;
	
	public DCase(){
		mine = false;
		decouverte = false;
		drapeau = false;
		selection = false;
		mimesAlentour = -1;
		
		ec=EtatCase.INCONNUE;
	}
	
	
	public boolean estMine(){
		return mine;
	}
	
	public int getMinesAlentour(){		
		return mimesAlentour;
	}
	
	public boolean yaDrapreau(){
		return drapeau;
	}
	
	public boolean estDecouverte(){
		return decouverte;
	}
		
	public void setDecouverte(){
		decouverte = true;
	}
	
	public void selectionner(){
		selection = true;
	}
	
	public void deselectionner(){
		selection = false;
	}
	
	public boolean select(){
		return selection;
	}
	
	public void drapeauAction(){
		if(!decouverte)
			drapeau = (!drapeau);
			
	}
	
	public void poserBombe(){
		mine = true;
	}
	
	public void setMinesAlentour(int nb){
		mimesAlentour = nb;
	}
	
	
	public EtatCase getEtatCase(EtatPartie ep) {
		if (decouverte) {
			switch(getMinesAlentour()) {
			case 0:
				ec = EtatCase.VIDE;
				break;
			case 1:
				ec = EtatCase.UN;
				break;
			case 2:
				ec = EtatCase.DEUX;
				break;
			case 3:
				ec = EtatCase.TROIS;
				break;
			case 4:
				ec = EtatCase.QUATRE;
				break;
			case 5:
				ec = EtatCase.CINQ;
				break;
			case 6:
				ec = EtatCase.SIX;
				break;
			case 7:
				ec = EtatCase.SEPT;
				break;
			case 8:
				ec = EtatCase.HUIT;
				break;
				
			}
		}
		if (ep==EtatPartie.PERDU) {
			if(mine) {
				ec=EtatCase.MINE;
			}
			if(!mine && drapeau) {
				ec=EtatCase.CROIX;
			}
		}
		if(drapeau) {
			ec=EtatCase.DRAPEAU;
		}
		return ec;
	}
}