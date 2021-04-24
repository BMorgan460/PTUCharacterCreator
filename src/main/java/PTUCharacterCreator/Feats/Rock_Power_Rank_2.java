package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Rock_Power_Rank_2 extends Feature {
	{
		name = "Rock Power Rank 2";
		tags = "[Ranked 2] [+Defense]";
		frequency = "Static";
		effect = "Each Rank, choose one of Sturdy, Rock Head, Run Up, or Sand Veil. You gain the chosen Ability. If you choose Sand Veil, you may consider sand a “solid surface” for the purposes of Stone Stance.";
		prereqs.put("Combat", 5);
		prereqs.put("Survival", 5);
	}
	public Rock_Power_Rank_2(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Combat",5) && t.checkSkillRank("Survival",5);
	}
}