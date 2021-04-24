package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Sunlight_Within extends Feature {
	{
		name = "Sunlight Within";
		tags = "[Orders] [Stratagem]";
		frequency = "Bind 2 AP - Standard Action";
		effect = "Target: Your Pokemon Effect: While this Stratagem is bound, your Pokemon may activate Moves and Abilities as if they were in Sunny Weather.";
		prereqs.put("Foiling Foliage", -1);
		prereqs.put("Type-Linked Skill at Adept", 0);
	}
	public Sunlight_Within(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Foiling Foliage");
	}
}