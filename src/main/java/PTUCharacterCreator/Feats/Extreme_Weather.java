package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Extreme_Weather extends Feature {
	{
		name = "Extreme Weather";
		tags = "[Climatology Research Field] [Branch]";
		frequency = "Daily x3 - Free Action";
		effect = "Trigger: You or your Pokemon create a Weather Condition Effect: The Weather is particularly intense and has additional effects. »» Hail: All Trainers and Pokemon that take Hail Damage take a -5 Penalty to all Damage Rolls. »» Rain: All Trainers and Pokemon that are not Water or Grass typed are Slowed. »» Sandstorm: All Trainers and Pokemon that take Sandstorm damage take a -2 Penalty to Accuracy Rolls. »» Sun: Trainers and Pokemon that are not Fire or Grass Typed are Suppressed.";
		prereqs.put("Climate Control", -1);
		prereqs.put("Survival", 6);
	}
	public Extreme_Weather(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Climate Control") && t.checkSkillRank("Survival",6);
	}
}