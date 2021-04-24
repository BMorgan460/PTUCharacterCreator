package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Sneak_Attack extends Feature {
	{
		name = "Sneak Attack";
		tags = "[Orders] [Stratagem]";
		frequency = "Bind 2 AP - Standard Action";
		effect = "Target: Your Dark-Type Pokemon Effect: While this Feature is bound, when attacking foes that are Fainted, Flanked, Flinched, Sleeping, Stuck, Tripped, unaware of your Pokemons presence, or otherwise do not expect an attack, the target gains a +2 bonus to Accuracy Rolls and a bonus to Damage Rolls equal to your Type-Linked Skill Rank.";
		prereqs.put("Clever Ruse", -1);
		prereqs.put("Type-Linked Skill at Adept", 0);
	}
	public Sneak_Attack(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Clever Ruse");
	}
}