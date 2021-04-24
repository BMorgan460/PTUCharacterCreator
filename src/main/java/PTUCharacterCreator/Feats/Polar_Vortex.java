package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Polar_Vortex extends Feature {
	{
		name = "Polar Vortex";
		tags = "[Orders] [Stratagem]";
		frequency = "Bind 2 AP - Standard Action";
		effect = "Target: Your Pokemon Effect: While this Stratagem is bound, your Pokemon may activate Moves and Abilities as if they were in Hail.";
		prereqs.put("Glacial Ice", -1);
		prereqs.put("Type-Linked Skill at Adept", 0);
	}
	public Polar_Vortex(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Glacial Ice");
	}
}