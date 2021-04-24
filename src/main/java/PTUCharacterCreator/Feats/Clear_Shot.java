package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Clear_Shot extends Feature {
	{
		name = "Clear Shot";
		tags = "[+Attack][Weapon]";
		frequency = "Scene x2 - Swift Action";
		effect = "Trigger: You make a ranged Weapon Attack against a target with no other combatants or Rough or Blocking Terrain within 2 meters Effect: The target is considered Vulnerable against this attack, and you increase your Critical Hit range by +4 for this attack.";
		prereqs.put("Marksman", -1);
		prereqs.put("Combat", 5);
		prereqs.put("Perception", 5);
	}
	public Clear_Shot(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Marksman") && t.checkSkillRank("Combat",5) && t.checkSkillRank("Perception",5);
	}
}