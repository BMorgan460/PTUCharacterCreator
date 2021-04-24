package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class In_My_Name_Rank_3 extends Feature {
	{
		name = "In My Name Rank 3";
		tags = "[Ranked 4][Patron Stat]";
		frequency = "Static";
		effect = "You gain a Blessing marked Rank 3 or lower. You must additionally meet any Prerequisites of the Blessing. Rank 3 Blessings: Blessed Resilience, Insight of the Great Ones";
		prereqs.put("A Major Gift", 0);
		prereqs.put("GM Permission", 0);
	}
	public In_My_Name_Rank_3(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return false;
	}
}