package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Poison_Ace extends Feature {
	{
		name = "Poison Ace";
		tags = "[Class] [Branch]";
		frequency = "At-Will - Extended Action";
		effect = "Target: Your Pokemon with at least 2 Tutor Points remaining. Effect: The target loses 2 Tutor Points and learns Venomor Type Strategist Ability for Poison. You may target a Pokemon only once with PoisonAce.";
		prereqs.put("2 Different Pokemon of Poison Type", 0);
		prereqs.put("Intimidate OR Stealth at Novice OR Elemental Connection (Bug)", 0);
		prereqs.put("1 Pokemon of the chosen Type", 0);
		prereqs.put("Intimidate OR Stealth at Novice.", 0);
	}
	public Poison_Ace(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Intimidate", 3) || t.checkSkillRank("Stealth", 3);
	}
}