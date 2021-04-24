package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Second_Strike extends Feature {
	{
		name = "Second Strike";
		tags = "[Special]";
		frequency = "At-Will - Free Action";
		effect = "Trigger: You attempt to use a Grapple, Push, Trip, or Disarm Combat Maneuver but fail the Opposed Roll Effect: You may immediately use Rock Smash or a Struggle Attack against your target as a Free Action.";
		prereqs.put("Martial Training Rank 1", -1);
		prereqs.put("Combat", 5);
	}
	public Second_Strike(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Martial Training Rank 1") && t.checkSkillRank("Combat",5);
	}
}