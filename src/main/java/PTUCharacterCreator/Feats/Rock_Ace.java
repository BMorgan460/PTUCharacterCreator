package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Rock_Ace extends Feature {
	{
		name = "Rock Ace";
		tags = "[Class] [Branch]";
		frequency = "At-Will - Extended Action";
		effect = "Target: Your Pokemon with at least 2 Tutor Points remaining. Effect: The target loses 2 Tutor Points and learns Mountain Peakor Type Strategist Ability for Rock. You may target a Pokemon only once with RockAce.";
		prereqs.put("2 Different Pokemon of Rock Type", 0);
		prereqs.put("Combat OR Survival at Novice OR Elemental Connection (Bug)", 0);
		prereqs.put("1 Pokemon of the chosen Type", 0);
		prereqs.put("Combat OR Survival at Novice.", 0);
	}
	public Rock_Ace(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Combat", 3) || t.checkSkillRank("Survival", 3);
	}
}