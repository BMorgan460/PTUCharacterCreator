package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Iron_Grit extends Feature {
	{
		name = "Iron Grit";
		tags = "[Orders] [Stratagem]";
		frequency = "Bind 2 AP - Standard Action";
		effect = "When this Feature becomes Bound, the target gains +1 Defense Combat Stage. While the Feature remains bound, the targets Defense Stat cannot be lowered, and its Defense Combat Stages cannot be lowered.";
		prereqs.put("Polished Shine", -1);
		prereqs.put("Type-Linked Skill at Adept", 0);
	}
	public Iron_Grit(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Polished Shine");
	}
}