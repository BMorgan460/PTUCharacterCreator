package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Ninja extends Feature {
	{
		name = "Ninja";
		tags = "[Class] [+Speed]";
		frequency = "Static";
		effect = "You learn the Moves Double Team and Poison Powder.";
		prereqs.put("Stealth", 3);
		prereqs.put("Combat", 3);
	}
	public Ninja(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Stealth",3) && t.checkSkillRank("Combat",3);
	}
}