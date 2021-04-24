package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Ghost_Ace extends Feature {
	{
		name = "Ghost Ace";
		tags = "[Class] [Branch]";
		frequency = "At-Will - Extended Action";
		effect = "Target: Your Pokemon with at least 2 Tutor Points remaining. Effect: The target loses 2 Tutor Points and learns Hauntor Type Strategist Ability for Ghost. You may target a Pokemon only once with GhostAce.";
		prereqs.put("2 Different Pokemon of Ghost Type", 0);
		prereqs.put("Ocu Edu OR Intimidate at Novice OR Elemental Connection (Bug)", 0);
		prereqs.put("1 Pokemon of the chosen Type", 0);
		prereqs.put("Ocu Edu OR Intimidate at Novice.", 0);
	}
	public Ghost_Ace(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Ocu Edu", 3) || t.checkSkillRank("Intimidate", 3);
	}
}