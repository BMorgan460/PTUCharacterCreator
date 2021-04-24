package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Sovereignty extends Feature {
	{
		name = "Sovereignty";
		tags = "[+Attack]";
		frequency = "Bind 2 AP - Standard Action ";
		effect = "Effect: While this Feature is bound, you gain a +2 Bonus to Save Checks against Volatile Status Afflictions, and a +2 Bonus to Opposed Checks when defending against being Disarmed, Grappled, Pushed, or Tripped.";
		prereqs.put("Herald of Pride", -1);
		prereqs.put("Command", 5);
		prereqs.put("Intimidate", 5);
	}
	public Sovereignty(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Herald of Pride") && t.checkSkillRank("Command",5) && t.checkSkillRank("Intimidate",5);
	}
}