package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Earth_Mothers_Blessing_Rank_2 extends Feature {
	{
		name = "Earth Mother's Blessing Rank 2";
		tags = "[Ranked 2] [+Defense]";
		frequency = "Static";
		effect = "Each Rank, choose one of Arena Trap or Lightningrod. You gain the chosen Ability.";
		prereqs.put("Ground Out", -1);
		prereqs.put("Focus", 6);
		prereqs.put("Intuition", 6);
	}
	public Earth_Mothers_Blessing_Rank_2(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Ground Out") && t.checkSkillRank("Focus",6) && t.checkSkillRank("Intuition",6);
	}
}