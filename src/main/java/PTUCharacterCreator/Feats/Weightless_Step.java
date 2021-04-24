package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Weightless_Step extends Feature {
	{
		name = "Weightless Step";
		tags = "[+Speed]";
		frequency = "Static";
		effect = "You gain the Infiltrator Ability.";
		prereqs.put("Ninja", -1);
		prereqs.put("Stealth", 5);
	}
	public Weightless_Step(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Ninja") && t.checkSkillRank("Stealth",5);
	}
}