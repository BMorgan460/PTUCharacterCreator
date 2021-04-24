package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Flying_Ace extends Feature {
	{
		name = "Flying Ace";
		tags = "[Class] [Branch]";
		frequency = "At-Will - Extended Action";
		effect = "Target: Your Pokemon with at least 2 Tutor Points remaining. Effect: The target loses 2 Tutor Points and learns Mach Speedor Type Strategist Ability for Flying. You may target a Pokemon only once with FlyingAce.";
		prereqs.put("2 Different Pokemon of Flying Type", 0);
		prereqs.put("Perception OR Acrobatics at Novice OR Elemental Connection (Bug)", 0);
		prereqs.put("1 Pokemon of the chosen Type", 0);
		prereqs.put("Perception OR Acrobatics at Novice.", 0);
	}
	public Flying_Ace(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Perception", 3) || t.checkSkillRank("Acrobatics", 3);
	}
}