package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Outmaneuver extends Feature {
	{
		name = "Outmaneuver";
		tags = "[+Speed]";
		frequency = "Scene x3 - Free Action";
		effect = "Trigger: You use a damaging Attack Effect: Add half your Evasion to your Accuracy Roll for the attack, and all foes hit by the attack have their Initiative reduced by your full Evasion value.";
		prereqs.put("Harrier", -1);
		prereqs.put("Acrobatics", 4);
		prereqs.put("Combat", 4);
	}
	public Outmaneuver(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Harrier") && t.checkSkillRank("Acrobatics",4) && t.checkSkillRank("Combat",4);
	}
}