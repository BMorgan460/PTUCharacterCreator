package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Corrupt_Blood extends Feature {
	{
		name = "Corrupt Blood";
		tags = "[+Defense]";
		frequency = "Static";
		effect = "You are immune to the Poisoned and Badly Poisoned statuses and resist Poison-type attacks one step further.";
		prereqs.put("Miasmic", -1);
	}
	public Corrupt_Blood(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Miasmic");
	}
}