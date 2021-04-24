package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Steel_Ace extends Feature {
	{
		name = "Steel Ace";
		tags = "[Class] [Branch]";
		frequency = "At-Will - Extended Action";
		effect = "Target: Your Pokemon with at least 2 Tutor Points remaining. Effect: The target loses 2 Tutor Points and learns Unbreakableor Type Strategist Ability for Steel. You may target a Pokemon only once with SteelAce.";
		prereqs.put("2 Different Pokemon of Steel Type", 0);
		prereqs.put("Athletics OR Intimidate at Novice OR Elemental Connection (Bug)", 0);
		prereqs.put("1 Pokemon of the chosen Type", 0);
		prereqs.put("Athletics OR Intimidate at Novice.", 0);
	}
	public Steel_Ace(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Athletics", 3) || t.checkSkillRank("Intimidate", 3);
	}
}