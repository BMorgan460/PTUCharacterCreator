package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Complex_Aftertaste extends Feature {
	{
		name = "Complex Aftertaste";
		tags = "";
		frequency = "1 AP - Free Action";
		effect = "Trigger: You or an ally trades in a Digestion/Food Buff from an item with a Taste Effect: The target gains a Digestion/Food Buff according to the Taste of the Snack granting the Buff. This Digestion/Food Buff matches that of the corresponding basic Tasty Snack recipe. Recipe - Leftovers";
		prereqs.put("Accentuated Taste", -1);
	}
	public Complex_Aftertaste(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Accentuated Taste");
	}
}