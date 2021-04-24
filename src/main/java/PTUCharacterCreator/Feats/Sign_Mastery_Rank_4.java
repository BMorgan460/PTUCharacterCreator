package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Sign_Mastery_Rank_4 extends Feature {
	{
		name = "Sign Mastery Rank 4";
		tags = "[Ranked 4][Patron Stat]";
		frequency = "Static";
		effect = "You gain two Blessings in the form of Signs, marked Rank 3 or lower. You must additionally meet any Prerequisites of the Blessing. Rank 3 Blessings: Blessed Resilience, Insight of the Great Ones";
		prereqs.put("A Pact Gift", 0);
		prereqs.put("GM Permission OR All your Patron's Major Gifts", 0);
		prereqs.put("GM Permission (if no Pact Gift)", 0);
	}
	public Sign_Mastery_Rank_4(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return false;
	}
}