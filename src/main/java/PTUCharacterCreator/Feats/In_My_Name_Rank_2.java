package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class In_My_Name_Rank_2 extends Feature {
	{
		name = "In My Name Rank 2";
		tags = "[Ranked 4][Patron Stat]";
		frequency = "Static";
		effect = "You gain a Blessing marked Rank 2 or lower. You must additionally meet any Prerequisites of the Blessing. Rank 2 Blessings: Blessed Power, Luck of the Gods, Soul Mending";
		prereqs.put("Completed a task on behalf of your Patron", 0);
		prereqs.put("GM Permission", 0);
	}
	public In_My_Name_Rank_2(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return false;
	}
}