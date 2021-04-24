package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Sign_Mastery_Rank_3 extends Feature {
	{
		name = "Sign Mastery Rank 3";
		tags = "[Ranked 4][Patron Stat]";
		frequency = "Static";
		effect = "You gain two Blessings in the form of Signs, marked Rank 3 or lower. You must additionally meet any Prerequisites of the Blessing. Rank 3 Blessings: Blessed Resilience, Insight of the Great Ones";
		prereqs.put("All your Patrons Major Gifts", 0);
		prereqs.put("GM Permission", 0);
	}
	public Sign_Mastery_Rank_3(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return false;
	}
}