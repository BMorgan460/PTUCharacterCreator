package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Crippling_Shot extends Feature {
	{
		name = "Crippling Shot";
		tags = "[+Attack][Weapon]";
		frequency = "2 AP - Full Action";
		effect = "Make a Ranged Struggle Attack attack with a -2 penalty to Accuracy. If you hit, the attack deals Damage as if it was resisted one step, but the target becomes Slowed, loses 1 Speed Combat Stage, and you initiate a Trip Maneuver against the target. You may use your Perception Skill to resolve the Opposed Check if you wish.";
		prereqs.put("Marksman", -1);
		prereqs.put("Combat", 5);
		prereqs.put("Perception", 5);
	}
	public Crippling_Shot(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Marksman") && t.checkSkillRank("Combat",5) && t.checkSkillRank("Perception",5);
	}
}