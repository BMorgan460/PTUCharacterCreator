package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Desert_Heart extends Feature {
	{
		name = "Desert Heart";
		tags = "[Orders] [Stratagem]";
		frequency = "Bind 2 AP - Standard Action";
		effect = "Target: Your Pokemon Effect: While this Stratagem is bound, your Pokemon may activate Moves and Abilities as if they were in a Sandstorm.";
		prereqs.put("Mold the Earth", -1);
		prereqs.put("Type-Linked Skill at Adept", 0);
	}
	public Desert_Heart(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Mold the Earth");
	}
}