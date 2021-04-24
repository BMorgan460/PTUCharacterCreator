package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Shared_Strengths_Rank_3 extends Feature {
	{
		name = "Shared Strengths Rank 3";
		tags = "[Ranked 3][Patron Stat]";
		frequency = "Static";
		effect = "You gain access to your Legendary Forms Move List while in your Avatar Form.";
		prereqs.put("True Power", -1);
		prereqs.put("Pokemon Form Level 50", -2);
	}
	public Shared_Strengths_Rank_3(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("True Power") && false;
	}
}