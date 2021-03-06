package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Mindbreak extends Feature {
	{
		name = "Mindbreak";
		tags = "[Orders] [Stratagem]";
		frequency = "Bind 2 AP - Standard Action";
		effect = "Target: Your Psychic-Type Pokemon Effect: While this Feature is Bound, the targets damaging Psychic-Type Moves gain a +1 Bonus to Effect Range and a +3 Bonus to Damage Rolls for each of the following conditions that the target is suffering: Bad Sleep, Confusion, Curse, Disabled, Flinch, Infatuation, Rage, or Suppression.";
		prereqs.put("Psionic Sponge", -1);
		prereqs.put("Type-Linked Skill at Adept", 0);
	}
	public Mindbreak(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Psionic Sponge");
	}
}