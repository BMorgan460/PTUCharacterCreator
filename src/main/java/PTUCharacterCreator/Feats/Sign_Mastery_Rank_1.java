package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Sign_Mastery_Rank_1 extends Feature {
	{
		name = "Sign Mastery Rank 1";
		tags = "[Ranked 4][Patron Stat]";
		frequency = "Static";
		effect = "You acquire two Rank 1 Blessings in the form of Signs. Rank 1 Blessings: Ancient Wisdom, Blessed Strike, Paragon, Spirit Mending";
		prereqs.put("Signer", -1);
		prereqs.put("GM Permission", 0);
	}
	public Sign_Mastery_Rank_1(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Signer");
	}
}