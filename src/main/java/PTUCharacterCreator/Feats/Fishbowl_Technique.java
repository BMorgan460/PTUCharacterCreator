package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Fishbowl_Technique extends Feature {
	{
		name = "Fishbowl Technique";
		tags = "[Orders] [Stratagem]";
		frequency = "Bind 2 AP - Standard Action";
		effect = "Target: Your Pokemon Effect: While this Stratagem is bound, your Pokemon may activate Moves and Abilities as if they were in Rainy Weather.";
		prereqs.put("Flood!", -1);
		prereqs.put("Type-Linked Skill at Adept", 0);
	}
	public Fishbowl_Technique(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Flood!");
	}
}