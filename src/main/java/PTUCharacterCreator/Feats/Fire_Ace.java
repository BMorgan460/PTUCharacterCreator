package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Fire_Ace extends Feature {
	{
		name = "Fire Ace";
		tags = "[Class] [Branch]";
		frequency = "At-Will - Extended Action";
		effect = "Target: Your Pokemon with at least 2 Tutor Points remaining. Effect: The target loses 2 Tutor Points and learns Blazeor Type Strategist Ability for Fire. You may target a Pokemon only once with FireAce.";
		prereqs.put("2 Different Pokemon of Fire Type", 0);
		prereqs.put("Focus OR Intimidate at Novice OR Elemental Connection (Bug)", 0);
		prereqs.put("1 Pokemon of the chosen Type", 0);
		prereqs.put("Focus OR Intimidate at Novice.", 0);
	}
	public Fire_Ace(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Focus", 3) || t.checkSkillRank("Intimidate", 3);
	}
}