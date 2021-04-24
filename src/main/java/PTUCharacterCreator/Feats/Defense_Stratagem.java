package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Defense_Stratagem extends Feature {
	{
		name = "Defense Stratagem";
		tags = "[Branch] [Orders] [Stratagem]";
		frequency = "2 AP - Standard Action";
		effect = "Target: Your Pokemon Effect: While this Feature is Bound, the target gains a +2 bonus to Save Checks against Paralysis, Sleep, and Freeze for each positive Combat Stage they have in Defense, up to a maximum of +6.";
		prereqs.put("Stat Link", -1);
		prereqs.put("Stat Training", -1);
		prereqs.put("Command", 6);
		prereqs.put("Focus", 6);
	}
	public Defense_Stratagem(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Defense Link") && t.hasFeat("Defense Training") && t.checkSkillRank("Command",6) && t.checkSkillRank("Focus",6);
	}
}