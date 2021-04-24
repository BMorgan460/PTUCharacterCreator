package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Dark_Soul extends Feature {
	{
		name = "Dark Soul";
		tags = "[+Attack or Special Attack]";
		frequency = "Static";
		effect = "Choose Shadow Tag or Super Luck. You gain the chosen Ability.";
		prereqs.put("Shade Caller", -1);
		prereqs.put("Guile", 6);
		prereqs.put("Stealth", 6);
	}
	public Dark_Soul(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Shade Caller") && t.checkSkillRank("Guile",6) && t.checkSkillRank("Stealth",6);
	}
}