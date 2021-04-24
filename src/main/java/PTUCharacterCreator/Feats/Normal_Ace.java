package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Normal_Ace extends Feature {
	{
		name = "Normal Ace";
		tags = "[Class] [Branch]";
		frequency = "At-Will - Extended Action";
		effect = "Target: Your Pokemon with at least 2 Tutor Points remaining. Effect: The target loses 2 Tutor Points and learns Last Chanceor Type Strategist Ability for Normal. You may target a Pokemon only once with NormalAce.";
		prereqs.put("2 Different Pokemon of Normal Type", 0);
		prereqs.put("Charm OR Intuition at Novice OR Elemental Connection (Bug)", 0);
		prereqs.put("1 Pokemon of the chosen Type", 0);
		prereqs.put("Charm OR Intuition at Novice.", 0);
	}
	public Normal_Ace(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Charm", 3) || t.checkSkillRank("Intuition", 3);
	}
}