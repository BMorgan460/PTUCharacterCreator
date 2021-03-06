package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Gift_of_Power extends Feature {
	{
		name = "Gift of Power";
		tags = "[Patron Stat]";
		frequency = "One Time Use";
		effect = "Target: A Trainer Effect: You gift your target with a Blessing of your own. Whether this makes them Touched, a Signer, or Branded is at your digression. The actual Blessings may not need be the one listed here for your Legendary Form, but ones of your own creation at your GMs discretion.";
		prereqs.put("Pokemon Form Level 60", -2);
	}
	public Gift_of_Power(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return false;
	}
}