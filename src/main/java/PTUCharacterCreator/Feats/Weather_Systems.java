package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Weather_Systems extends Feature {
	{
		name = "Weather Systems";
		tags = "[Climatology Research Field] [Branch]";
		frequency = "At-Will - Extended Action";
		effect = "Target: Your Pokemon with at least 2 Tutor Point Effect: Your Pokemon loses 2 Tutor Points, and learns your choice of Hail, Rain Dance, Sandstorm, or Sunny Day. The target must be able to learn the chosen Move through Level-Up, TM, or Tutor Moves. If the target has the chosen Move in their Level-Up List, Weather Systems costs no Tutor Points.";
		prereqs.put("Climatology", -1);
		prereqs.put("Survival", 5);
	}
	public Weather_Systems(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Climatology") && t.checkSkillRank("Survival",5);
	}
}