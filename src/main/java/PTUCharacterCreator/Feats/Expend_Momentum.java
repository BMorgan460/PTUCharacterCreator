package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Expend_Momentum extends Feature {
	{
		name = "Expend Momentum";
		tags = "[Orders]";
		frequency = "At-Will - Standard Action";
		effect = "Target: Your Pokemon under the effects of Focused Training Effect: Apply one of the following effects on the target by spending that much Momentum. »» Spend 1 Momentum: Your Pokemon regains use of a EOT Frequency Move. »» Spend 2 Momentum: Your Pokemon automatically rolls an 11 on one d20 Roll of your choice on their next turn. »» Spend 3 Momentum: Your Pokemon regains a use of Scene Frequency Move. May be chosen only once per Scene per Pokemon.";
		prereqs.put("Duelist", -1);
	}
	public Expend_Momentum(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Duelist");
	}
}