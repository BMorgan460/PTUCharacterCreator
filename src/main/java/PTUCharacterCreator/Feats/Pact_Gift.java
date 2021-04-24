package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Pact_Gift extends Feature {
	{
		name = "Pact Gift";
		tags = "[Patron Stat]";
		frequency = "Static";
		effect = "You gain your Patrons Pact Gift, found in the Blessed and Damned splatbook. Lower Pantheon Legendaries do not have Pact Gifts.";
		prereqs.put("All of your Patrons Major Gifts", 0);
		prereqs.put("GM Permission", 0);
	}
	public Pact_Gift(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return false;
	}
}