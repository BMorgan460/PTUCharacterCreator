package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Fighting_Ace extends Feature {
	{
		name = "Fighting Ace";
		tags = "[Class] [Branch]";
		frequency = "At-Will - Extended Action";
		effect = "Target: Your Pokemon with at least 2 Tutor Points remaining. Effect: The target loses 2 Tutor Points and learns Focusor Type Strategist Ability for Fighting. You may target a Pokemon only once with FightingAce.";
		prereqs.put("2 Different Pokemon of Fighting Type", 0);
		prereqs.put("Combat OR Intuition at Novice OR Elemental Connection (Bug)", 0);
		prereqs.put("1 Pokemon of the chosen Type", 0);
		prereqs.put("Combat OR Intuition at Novice.", 0);
	}
	public Fighting_Ace(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Combat", 3) || t.checkSkillRank("Intuition", 3);
	}
}