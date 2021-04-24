package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class In_My_Name_Rank_1 extends Feature {
	{
		name = "In My Name Rank 1";
		tags = "[Ranked 4][Patron Stat]";
		frequency = "Static";
		effect = "You gain a Rank 1 Blessing. Rank 1 Blessings: Ancient Wisdom, Blessed Strike, Paragon, Spirit Mending";
		prereqs.put("Messiah", -1);
		prereqs.put("GM Permission", 0);
	}
	public In_My_Name_Rank_1(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Messiah");
	}
}