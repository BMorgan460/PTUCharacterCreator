package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Speed_Stratagem extends Feature {
	{
		name = "Speed Stratagem";
		tags = "[Branch] [Orders] [Stratagem]";
		frequency = "2 AP - Standard Action";
		effect = "Target: Your Pokemon Effect: While this Feature is Bound, the targets Movement Capabilities are increased by 1 for each positive Combat Stage they have in Speed, up to a maximum of +3.";
		prereqs.put("Stat Link", -1);
		prereqs.put("Stat Training", -1);
		prereqs.put("Command", 6);
		prereqs.put("Focus", 6);
	}
	public Speed_Stratagem(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Speed Link") && t.hasFeat("Speed Training") && t.checkSkillRank("Command",6) && t.checkSkillRank("Focus",6);
	}
}