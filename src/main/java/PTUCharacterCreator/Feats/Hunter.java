package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Hunter extends Feature {
	{
		name = "Hunter";
		tags = "[Class][+Speed]";
		frequency = "Static";
		effect = "Choose Teamwork or Pack Hunt. You gain the Chosen Ability.";
		prereqs.put("Survival", 3);
		prereqs.put("Stealth", 3);
	}
	public Hunter(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Survival",3) && t.checkSkillRank("Stealth",3);
	}
}