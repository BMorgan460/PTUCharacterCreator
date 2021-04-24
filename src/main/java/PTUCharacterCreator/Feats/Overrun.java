package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Overrun extends Feature {
	{
		name = "Overrun";
		tags = "[+Speed]";
		frequency = "Scene x2 - Free Action";
		effect = "Trigger: Your Mount with Run Up makes a Damage Roll for a Dash or Pass Move Effect: Your Pokemon adds their Speed Stat in addition to their normal attacking Stat to their Damage Roll. The target gains Damage Reduction against this attack equal to their own Speed Stat.";
		prereqs.put("Conqueror's March", -1);
		prereqs.put("Acrobatics", 5);
		prereqs.put("Athletics", 5);
	}
	public Overrun(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Conqueror's March") && t.checkSkillRank("Acrobatics",5) && t.checkSkillRank("Athletics",5);
	}
}