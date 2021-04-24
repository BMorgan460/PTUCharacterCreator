package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Chitin_Shield extends Feature {
	{
		name = "Chitin Shield";
		tags = "";
		frequency = "Daily x3 - Free Action";
		effect = "Trigger: Your Bug-Type Pokemon is hit by a Status-Class Move Effect: The effect misses, and your Pokemon becomes immune to that Move for the rest of the Scene. Chitin Shield may be triggered once per Scene per Pokemon.";
		prereqs.put("Insectoid Utility", -1);
		prereqs.put("Type Linked Skill at Expert", 0);
	}
	public Chitin_Shield(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Insectoid Utility");
	}
}