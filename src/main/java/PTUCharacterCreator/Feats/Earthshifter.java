package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Earthshifter extends Feature {
	{
		name = "Earthshifter";
		tags = "[+Defense]";
		frequency = "2 AP - Swift Action";
		effect = "Trigger: You hit with a damaging Ground Type Move Effect: You initiate a Trip Maneuver against 1 target of the Move. The Maneuver automatically hits, and you may use your Focus or Intuition for the opposed check.";
		prereqs.put("Ground Out", -1);
	}
	public Earthshifter(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Ground Out");
	}
}