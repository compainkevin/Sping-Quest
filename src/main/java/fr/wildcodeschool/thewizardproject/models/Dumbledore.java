package fr.wildcodeschool.thewizardproject.models;
import fr.wildcodeschool.thewizardproject.models.Outfit;

public class Dumbledore implements WizardInterface {

	Outfit outfit ;
	
	public Dumbledore(Outfit param_outfit) {
		// TODO Auto-generated constructor stub
		outfit = param_outfit;
	}
	
	@Override
	public String giveAdvice() {
		// TODO Auto-generated method stub
		return "Change your dress !!!";
	}

	@Override
	public String changeDress() {
		// TODO Auto-generated method stub
		return this.outfit.chooseDress();
	}

}
