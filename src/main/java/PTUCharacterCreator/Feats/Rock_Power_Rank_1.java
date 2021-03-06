package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Rock_Power_Rank_1 extends Feature {
	{
		name = "Rock Power Rank 1";
		tags = "[Ranked 2] [+Defense]";
		frequency = "Static";
		effect = "Each Rank, choose one of Sturdy, Rock Head, Run Up, or Sand Veil. You gain the chosen Ability. If you choose Sand Veil, you may consider sand a ?solid surface? for the purposes of Stone Stance.";
		prereqs.put("Combat", 4);
		prereqs.put("Survival", 4);
	}
	public Rock_Power_Rank_1(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Combat",4) && t.checkSkillRank("Survival",4);
	}
}