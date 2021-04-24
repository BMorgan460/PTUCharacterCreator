package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Culinary_Appreciation extends Feature {
	{
		name = "Culinary Appreciation";
		tags = "";
		frequency = "At-Will - Extended Action";
		effect = "Target: Your Pokemon with at least 2 Tutor Points remaining Effect: The target loses 2 Tutor Points and gains the Gluttony Ability. Recipe - Bait Mixer";
		prereqs.put("Chef", -1);
	}
	public Culinary_Appreciation(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Chef");
	}
}