package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Guardians_Punishment extends Feature {
	{
		name = "Guardian's Punishment";
		tags = "[+Defense]";
		frequency = "Scene x2 - Swift Action ";
		effect = "Trigger: You hit a Marked Foe with a Damaging Weapon attack Effect: Add your Defense Stat to the Damage Roll. The Marked Foe takes a penalty to Damage Rolls equal to your Combat or Focus Rank for 1 full round.";
		prereqs.put("Fortress", -1);
		prereqs.put("Combat", 5);
		prereqs.put("Focus", 5);
	}
	public Guardians_Punishment(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Fortress") && t.checkSkillRank("Combat",5) && t.checkSkillRank("Focus",5);
	}
}