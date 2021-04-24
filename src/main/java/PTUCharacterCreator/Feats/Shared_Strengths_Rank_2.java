package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Shared_Strengths_Rank_2 extends Feature {
	{
		name = "Shared Strengths Rank 2";
		tags = "[Ranked 3][Patron Stat]";
		frequency = "Static";
		effect = "You gain your Legendary Forms Types while in your Avatar Form";
		prereqs.put("Pokemon Form Level 35", -2);
	}
	public Shared_Strengths_Rank_2(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return false;
	}
}