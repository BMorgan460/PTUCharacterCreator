package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class True_Power extends Feature {
	{
		name = "True Power";
		tags = "[Patron Stat]";
		frequency = "Static";
		effect = "You gain one of the Domains and its corresponding Legendary Aura associated with your Legendary Form. This Feature may be taken multiple times, but with the second time at Pokemon Form Level 60, and the third at Pokemon Form level 75.";
		prereqs.put("Shared Strengths Rank 2", -1);
		prereqs.put("Pokemon Form Level 40", -2);
	}
	public True_Power(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Shared Strengths Rank 2") && false;
	}
}