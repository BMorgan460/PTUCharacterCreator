package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Climatology extends Feature {
	{
		name = "Climatology";
		tags = "[Climatology Research Field] [Branch]";
		frequency = "Static";
		effect = "You gain the Overcoat Ability.";
		prereqs.put("Survival", 3);
	}
	public Climatology(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Survival",3);
	}
}