package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Special_Attack_Stratagem extends Feature {
	{
		name = "Special Attack Stratagem";
		tags = "[Branch] [Orders] [Stratagem]";
		frequency = "2 AP - Standard Action";
		effect = "Target: Your Pokemon Effect: While this Feature is Bound, the targets damaging Ranged Attacks have their Effect Range increased by 1 for each positive Combat Stage they have in Special Attack, up to a maximum of +3.";
		prereqs.put("Stat Link", -1);
		prereqs.put("Stat Training", -1);
		prereqs.put("Command", 6);
		prereqs.put("Focus", 6);
	}
	public Special_Attack_Stratagem(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Special Attack Link") && t.hasFeat("Special Attack Training") && t.checkSkillRank("Command",6) && t.checkSkillRank("Focus",6);
	}
}