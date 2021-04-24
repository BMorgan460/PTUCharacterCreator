package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Fire_Breather_Rank_2 extends Feature {
	{
		name = "Fire Breather Rank 2";
		tags = "[+Special Attack or Attack]";
		frequency = "Static";
		effect = "Learn two Fire Breather Moves from the list below. You may choose any Move marked with the Fire Breather Rank you are taking or lower. Rank 2 Moves: Blaze Kick, Fiery Dance, Flare Blitz, Heat Wave";
		prereqs.put("Combat", 6);
		prereqs.put("Focus", 6);
	}
	public Fire_Breather_Rank_2(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Combat",6) && t.checkSkillRank("Focus",6);
	}
}