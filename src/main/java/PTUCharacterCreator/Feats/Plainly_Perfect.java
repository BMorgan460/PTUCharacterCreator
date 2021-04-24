package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Plainly_Perfect extends Feature {
	{
		name = "Plainly Perfect";
		tags = "[Orders] [Stratagem]";
		frequency = "Bind 2 AP - Standard Action";
		effect = "Target: Your Pokemon Effect: While this Feature is bound, instead of rolling for damage with Normal-Type Moves, your Pokemon acts as if they rolled the maximum value on their Damage Dice Roll. Plainly Perfect only works for the first instance of the Damage Dice Roll on Critical Hits.";
		prereqs.put("Extra Ordinary", -1);
		prereqs.put("Type-Linked Skill at Adept", 0);
	}
	public Plainly_Perfect(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Extra Ordinary");
	}
}