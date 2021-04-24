package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Brace_for_Impact extends Feature {
	{
		name = "Brace for Impact";
		tags = "[Orders][Stratagem]";
		frequency = "Bind 2 AP - Standard Action";
		effect = "Target: Your Pokemon Effect: While this Feature is Bound, once a round, when the target uses a self-targeting Status Move, they may gain 5 Damage Reduction until the end of their next turn. They may also activate this effect as a Standard Action.";
		prereqs.put("Guardian Orders", -1);
	}
	public Brace_for_Impact(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Guardian Orders");
	}
}