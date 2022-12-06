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
	
	public boolean yaDrapeau(){
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
		switch (ep) {
		case PASFINI:
            if(yaDrapeau())return EtatCase.DRAPEAU;
            if(!estDecouverte()) {
            	if(select()) {
            		return EtatCase.SELECTION;
            	}else {
            		return EtatCase.INCONNUE;
            	}        	
            }
            return EtatCase.DECOUVERTE;
		case PERDU:
			if(estMine()) {
				return EtatCase.MINE;
			}
			if(!estMine() && yaDrapeau()) {
				return EtatCase.CROIX;
			}
			if(!estDecouverte()) {
				return EtatCase.INCONNUE;
            }
			return EtatCase.DECOUVERTE;		
		case GAGNE:
			return EtatCase.DECOUVERTE;
		
		}
		return EtatCase.DECOUVERTE;
	}
}