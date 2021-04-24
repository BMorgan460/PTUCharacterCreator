package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Ground_Ace extends Feature {
	{
		name = "Ground Ace";
		tags = "[Class] [Branch]";
		frequency = "At-Will - Extended Action";
		effect = "Target: Your Pokemon with at least 2 Tutor Points remaining. Effect: The target loses 2 Tutor Points and learns Landslideor Type Strategist Ability for Ground. You may target a Pokemon only once with GroundAce.";
		prereqs.put("2 Different Pokemon of Ground Type", 0);
		prereqs.put("Perception OR Intuition at Novice OR Elemental Connection (Bug)", 0);
		prereqs.put("1 Pokemon of the chosen Type", 0);
		prereqs.put("Perception OR Intuition at Novice.", 0);
	}
	public Ground_Ace(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Perception", 3) || t.checkSkillRank("Intuition", 3);
	}
}