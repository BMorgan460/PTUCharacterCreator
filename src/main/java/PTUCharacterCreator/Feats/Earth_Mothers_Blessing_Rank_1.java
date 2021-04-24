package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Earth_Mothers_Blessing_Rank_1 extends Feature {
	{
		name = "Earth Mother's Blessing Rank 1";
		tags = "[Ranked 2] [+Defense]";
		frequency = "Static";
		effect = "Each Rank, choose one of Arena Trap or Lightningrod. You gain the chosen Ability.";
		prereqs.put("Focus", 4);
		prereqs.put("Intuition", 4);
	}
	public Earth_Mothers_Blessing_Rank_1(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Focus",4) && t.checkSkillRank("Intuition",4);
	}
}