package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Highlander extends Feature {
	{
		name = "Highlander";
		tags = "[Orders] [Stratagem]";
		frequency = "Bind 2 AP - Standard Action";
		effect = "Target: Your Dragon-Type Pokemon Effect: While this Feature is Bound, the target gains X Damage Reduction against Dragon-Type attacks, and gain a +X Bonus to Damage Rolls with Dragon-Typed attacks against other Dragon-Typed targets. X is equal to your Type-Linked Skill Rank.";
		prereqs.put("Tyrant's Roar", -1);
		prereqs.put("Type-Linked Skill at Adept", 0);
	}
	public Highlander(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Tyrant's Roar");
	}
}