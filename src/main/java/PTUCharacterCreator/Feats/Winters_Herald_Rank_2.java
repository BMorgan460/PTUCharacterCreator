package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Winters_Herald_Rank_2 extends Feature {
	{
		name = "Winters Herald Rank 2";
		tags = "[Ranked 2] [+Attack or Special Attack]";
		frequency = "Static";
		effect = "You may learn two Moves from the list below, marked with the Rank of Winters Herald you are gaining or lower. Rank 2 Moves: Avalanche, Blizzard, Frost Breath, Icicle Spear";
		prereqs.put("Athletics", 6);
		prereqs.put("Survival", 6);
	}
	public Winters_Herald_Rank_2(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Athletics",6) && t.checkSkillRank("Survival",6);
	}
}