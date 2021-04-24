package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Fairy_Ace extends Feature {
	{
		name = "Fairy Ace";
		tags = "[Class] [Branch]";
		frequency = "At-Will - Extended Action";
		effect = "Target: Your Pokemon with at least 2 Tutor Points remaining. Effect: The target loses 2 Tutor Points and learns Miracle Mileor Type Strategist Ability for Fairy. You may target a Pokemon only once with FairyAce.";
		prereqs.put("2 Different Pokemon of Fairy Type", 0);
		prereqs.put("Charm OR Guile at Novice OR Elemental Connection (Bug)", 0);
		prereqs.put("1 Pokemon of the chosen Type", 0);
		prereqs.put("Charm OR Guile at Novice.", 0);
	}
	public Fairy_Ace(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Charm", 3) || t.checkSkillRank("Guile", 3);
	}
}