package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Shared_Strengths_Rank_1 extends Feature {
	{
		name = "Shared Strengths Rank 1";
		tags = "[Ranked 3][Patron Stat]";
		frequency = "Static";
		effect = "You gain access to your Legendary Forms Abilities while in your Avatar form.";
		prereqs.put("Pokemon Form Level 20", -2);
	}
	public Shared_Strengths_Rank_1(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return false;
	}
}