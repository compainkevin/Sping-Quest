package fr.wildcodeschool.thewizardproject.models;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.wildcodeschool.thewizardproject.models.Outfit;


@Component("DumbledoreId")
public class Dumbledore implements WizardInterface {

	private Outfit outfit ;
	
	@Autowired
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
