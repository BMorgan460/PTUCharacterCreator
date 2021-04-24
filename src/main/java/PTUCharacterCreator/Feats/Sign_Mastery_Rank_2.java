package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Sign_Mastery_Rank_2 extends Feature {
	{
		name = "Sign Mastery Rank 2";
		tags = "[Ranked 4][Patron Stat]";
		frequency = "Static";
		effect = "You gain two Blessings in the form of Signs, marked Rank 2 or lower. You must additionally meet any Prerequisites of the Blessing. Rank 2 Blessings: Blessed Power, Luck of the Gods, Soul Mending";
		prereqs.put("A Major Gift", 0);
		prereqs.put("GM Permission", 0);
	}
	public Sign_Mastery_Rank_2(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return false;
	}
}