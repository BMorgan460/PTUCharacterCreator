package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Attack_Stratagem extends Feature {
	{
		name = "Attack Stratagem";
		tags = "[Branch] [Orders] [Stratagem]";
		frequency = "2 AP - Standard Action";
		effect = "Target: Your Pokemon Effect: While this Feature is Bound, the targets damaging Melee Attacks have their Critical Hit Range increased by 1 for each positive Combat Stage they have in Attack, up to a maximum of +3.";
		prereqs.put("Attack Link", -1);
		prereqs.put("Attack Training", -1);
		prereqs.put("Command", 6);
		prereqs.put("Focus", 6);
	}
	public Attack_Stratagem(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Attack Link") && t.hasFeat("Attack Training") && t.checkSkillRank("Command",6) && t.checkSkillRank("Focus",6);
	}
}