package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Savage_Strike extends Feature {
	{
		name = "Savage Strike";
		tags = "";
		frequency = "At-Will - Extended Action";
		effect = "Target: Your Pokemon with at least 2 Tutor Points Effect: The target loses 2 Tutor Points, and gains the Cruelty Ability.";
		prereqs.put("Taskmaster", -1);
	}
	public Savage_Strike(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Taskmaster");
	}
}