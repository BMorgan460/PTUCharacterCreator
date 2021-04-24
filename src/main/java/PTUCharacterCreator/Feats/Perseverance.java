package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Perseverance extends Feature {
	{
		name = "Perseverance";
		tags = "";
		frequency = "1 AP - Free Action";
		effect = "Trigger: Your Pokemon gains an Injury Effect: The target instead does not gain an Injury. Perseverance may activate only once per Scene per target.";
		prereqs.put("Ace Trainer", -1);
	}
	public Perseverance(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Ace Trainer");
	}
}