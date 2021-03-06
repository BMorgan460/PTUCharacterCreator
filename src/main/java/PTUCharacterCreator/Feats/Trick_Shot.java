package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Trick_Shot extends Feature {
	{
		name = "Trick Shot";
		tags = "[Orders][Stratagem]";
		frequency = "Bind 2 AP - Standard Action";
		effect = "Target: Your Pokemon Effect: While this Feature is Bound, decrease the Accuracy Roll of the targets damaging ranged attacks by -2. The Critical Hit range of those attacks is increased by +3. This Feature does not affect Moves without an AC value.";
		prereqs.put("Marksman Orders", -1);
	}
	public Trick_Shot(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Marksman Orders");
	}
}