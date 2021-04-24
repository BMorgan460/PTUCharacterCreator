package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Dietician extends Feature {
	{
		name = "Dietician";
		tags = "";
		frequency = "Static";
		effect = "Your Pokemon can benefit from a maximum of 7 Vitamins. Recipe - Vitamins";
		prereqs.put("Chef", -1);
		prereqs.put("Intuition", 5);
	}
	public Dietician(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Chef") && t.checkSkillRank("Intuition",5);
	}
}