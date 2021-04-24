package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Dragon_Ace extends Feature {
	{
		name = "Dragon Ace";
		tags = "[Class] [Branch]";
		frequency = "At-Will - Extended Action";
		effect = "Target: Your Pokemon with at least 2 Tutor Points remaining. Effect: The target loses 2 Tutor Points and learns Pure Bloodedor Type Strategist Ability for Dragon. You may target a Pokemon only once with DragonAce.";
		prereqs.put("2 Different Pokemon of Dragon Type", 0);
		prereqs.put("Command OR Intimidate at Novice OR Elemental Connection (Bug)", 0);
		prereqs.put("1 Pokemon of the chosen Type", 0);
		prereqs.put("Command OR Intimidate at Novice.", 0);
	}
	public Dragon_Ace(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Command", 3) || t.checkSkillRank("Intimidate", 3);
	}
}