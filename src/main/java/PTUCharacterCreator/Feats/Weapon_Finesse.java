package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Weapon_Finesse extends Feature {
	{
		name = "Weapon Finesse";
		tags = "[+Speed] [Weapon]";
		frequency = "2 AP - Swift Action";
		effect = "Trigger: You hit a foe with a Weapon Attack. Effect: After the attack is resolved, you may immediately use a Disarm, Trip, or Push Maneuver against that foe as a Free Action. The Maneuver automatically hits, but you must still make an Opposed Roll.";
		prereqs.put("Counter Stance", -1);
		prereqs.put("Acrobatics", 4);
		prereqs.put("Combat", 4);
	}
	public Weapon_Finesse(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Counter Stance") && t.checkSkillRank("Acrobatics",4) && t.checkSkillRank("Combat",4);
	}
}