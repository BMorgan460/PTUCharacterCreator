package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Fire_Breather_Rank_1 extends Feature {
	{
		name = "Fire Breather Rank 1";
		tags = "[+Special Attack or Attack]";
		frequency = "Static";
		effect = "Learn two Fire Breather Moves from the list below. Rank 1 Moves: Flamethrower, Fire Punch, Fire Spin, Sunny Day";
		prereqs.put("Combat", 5);
		prereqs.put("Focus", 5);
	}
	public Fire_Breather_Rank_1(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Combat",5) && t.checkSkillRank("Focus",5);
	}
}