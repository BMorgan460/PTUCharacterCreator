package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Iterative_Evolution extends Feature {
	{
		name = "Iterative Evolution";
		tags = "[Orders] [Stratagem]";
		frequency = "Bind 2 AP - Standard Action";
		effect = "Trigger: Your Pokemon hits with a damaging Bug-Type attack Effect: While this Feature is bound, if the triggering attack would deal Super-Effective Damage, it gains a +2 Bonus to Accuracy Check. If it would deal Neutral Damage, it gains a Bonus to its Damage Roll equal to your Type-Linked Skill Rank. If it would be resisted, it is resisted one step less. This is calculated after applying any other effects that would modify effectiveness before the Accuracy Roll is made, such as the Tinted Lens Ability.";
		prereqs.put("Insectoid Utility", -1);
		prereqs.put("Type-Linked Skill at Adept", 0);
	}
	public Iterative_Evolution(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Insectoid Utility");
	}
}