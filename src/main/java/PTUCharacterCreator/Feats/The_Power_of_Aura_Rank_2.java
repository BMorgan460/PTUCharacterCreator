package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class The_Power_of_Aura_Rank_2 extends Feature {
	{
		name = "The Power of Aura Rank 2";
		tags = "[+Attack or Special Attack] [Ranked 2]";
		frequency = "Static";
		effect = "You gain whichever Ability you did not choose for Rank 1.";
		prereqs.put("Aura Guardian", -1);
		prereqs.put("Intuition", 5);
	}
	public The_Power_of_Aura_Rank_2(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Aura Guardian") && t.checkSkillRank("Intuition",5);
	}
}