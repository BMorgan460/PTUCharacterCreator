package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Debilitate extends Feature {
	{
		name = "Debilitate";
		tags = "[Orders] [Stratagem]";
		frequency = "Bind 2 AP - Standard Action";
		effect = "Target: Your Poison-Type Pokemon Effect: While this Feature is Bound, when the target sucessfully hits a Poisoned or Blighted foe with a Poison- Type Move, the foe gains a -2 penalty to Accuracy Rolls and Evasion for one full round.";
		prereqs.put("Potent Venom", -1);
		prereqs.put("Type-Linked Skill at Adept", 0);
	}
	public Debilitate(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Potent Venom");
	}
}