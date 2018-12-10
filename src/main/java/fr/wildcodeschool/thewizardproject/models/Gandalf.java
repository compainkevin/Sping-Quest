package fr.wildcodeschool.thewizardproject.models;

public class Gandalf implements WizardInterface {
	
Outfit outfit ;
	
	public Gandalf(Outfit param_outfit) {
		// TODO Auto-generated constructor stub
		outfit = param_outfit;
	}

	@Override
	public String giveAdvice() {
		// TODO Auto-generated method stub
		return "Your dress is Dark !!!";
	}

	@Override
	public String changeDress() {
		// TODO Auto-generated method stub
		return this.outfit.chooseDress();
	}

}
