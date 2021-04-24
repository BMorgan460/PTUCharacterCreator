package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Grass_Ace extends Feature {
	{
		name = "Grass Ace";
		tags = "[Class] [Branch]";
		frequency = "At-Will - Extended Action";
		effect = "Target: Your Pokemon with at least 2 Tutor Points remaining. Effect: The target loses 2 Tutor Points and learns Overgrowor Type Strategist Ability for Grass. You may target a Pokemon only once with GrassAce.";
		prereqs.put("2 Different Pokemon of Grass Type", 0);
		prereqs.put("Survival OR Gen Edu at Novice OR Elemental Connection (Bug)", 0);
		prereqs.put("1 Pokemon of the chosen Type", 0);
		prereqs.put("Survival OR Gen Edu at Novice.", 0);
	}
	public Grass_Ace(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Survival", 3) || t.checkSkillRank("Gen Edu", 3);
	}
}