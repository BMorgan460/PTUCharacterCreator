package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Hits_the_Spot extends Feature {
	{
		name = "Hits the Spot";
		tags = "";
		frequency = "1 AP - Free Action";
		effect = "Trigger: You or your Pokemon trade in a Digestion/Food Buff Effect: The target gains Temporary Hit Points equal to your Intuition Rank doubled. These Temporary Hit Points stack from any Temporary Hit Points granted by Accentuated Taste, the Digestion/Food Buff or by the Lunchbox Ability. Recipe - Hearty Meal";
		prereqs.put("Chef", -1);
	}
	public Hits_the_Spot(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Chef");
	}
}