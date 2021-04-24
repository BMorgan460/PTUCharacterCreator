package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Electric_Ace extends Feature {
	{
		name = "Electric Ace";
		tags = "[Class] [Branch]";
		frequency = "At-Will - Extended Action";
		effect = "Target: Your Pokemon with at least 2 Tutor Points remaining. Effect: The target loses 2 Tutor Points and learns Overloador Type Strategist Ability for Electric. You may target a Pokemon only once with ElectricAce.";
		prereqs.put("2 Different Pokemon of Electric Type", 0);
		prereqs.put("Focus OR Tech Edu at Novice OR Elemental Connection (Bug)", 0);
		prereqs.put("1 Pokemon of the chosen Type", 0);
		prereqs.put("Focus OR Tech Edu at Novice.", 0);
	}
	public Electric_Ace(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Focus", 3) || t.checkSkillRank("Tech Edu", 3);
	}
}