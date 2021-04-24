package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Bug_Ace extends Feature {
	{
		name = "Bug Ace";
		tags = "[Class] [Branch]";
		frequency = "At-Will - Extended Action";
		effect = "Target: Your Pokemon with at least 2 Tutor Points remaining. Effect: The target loses 2 Tutor Points and learns Swarmor Type Strategist Ability for Bug. You may target a Pokemon only once with BugAce.";
		prereqs.put("2 Different Pokemon of Bug Type", 0);
		prereqs.put("Command OR Survival at Novice OR Elemental Connection (Bug)", 0);
		prereqs.put("1 Pokemon of the chosen Type", 0);
		prereqs.put("Command OR Survival at Novice.", 0);
	}
	public Bug_Ace(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Command", 3) || t.checkSkillRank("Survival", 3);
	}
}