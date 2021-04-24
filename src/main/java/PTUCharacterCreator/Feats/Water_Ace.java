package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Water_Ace extends Feature {
	{
		name = "Water Ace";
		tags = "[Class] [Branch]";
		frequency = "At-Will - Extended Action";
		effect = "Target: Your Pokemon with at least 2 Tutor Points remaining. Effect: The target loses 2 Tutor Points and learns Torrentor Type Strategist Ability for Water. You may target a Pokemon only once with WaterAce.";
		prereqs.put("2 Different Pokemon of Water Type", 0);
		prereqs.put("Athletics OR Intuition at Novice OR Elemental Connection (Bug)", 0);
		prereqs.put("1 Pokemon of the chosen Type", 0);
		prereqs.put("Athletics OR Intuition at Novice.", 0);
	}
	public Water_Ace(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Athletics", 3) || t.checkSkillRank("Intuition", 3);
	}
}