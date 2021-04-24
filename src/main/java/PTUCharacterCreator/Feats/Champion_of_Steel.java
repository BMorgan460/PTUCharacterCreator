package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Champion_of_Steel extends Feature {
	{
		name = "Champion of Steel";
		tags = "[+Defense] [Weapon]";
		frequency = "1 AP - Free Action";
		effect = "Trigger: You make a Weapon Attack. Effect: The attack or Move increases your Defense by 1 Combat Stage on 16+ and you may have it deal Steel-Type Damage if you wish.";
		prereqs.put("Steelheart", -1);
	}
	public Champion_of_Steel(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Steelheart");
	}
}