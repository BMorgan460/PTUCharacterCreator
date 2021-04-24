package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Dark_Ace extends Feature {
	{
		name = "Dark Ace";
		tags = "[Class] [Branch]";
		frequency = "At-Will - Extended Action";
		effect = "Target: Your Pokemon with at least 2 Tutor Points remaining. Effect: The target loses 2 Tutor Points and learns Dark Artor Type Strategist Ability for Dark. You may target a Pokemon only once with DarkAce.";
		prereqs.put("2 Different Pokemon of Dark Type", 0);
		prereqs.put("Guile OR Stealth at Novice OR Elemental Connection (Bug)", 0);
		prereqs.put("1 Pokemon of the chosen Type", 0);
		prereqs.put("Guile OR Stealth at Novice.", 0);
	}
	public Dark_Ace(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Guile", 3) || t.checkSkillRank("Stealth", 3);
	}
}