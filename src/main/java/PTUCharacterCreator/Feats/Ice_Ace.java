package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Ice_Ace extends Feature {
	{
		name = "Ice Ace";
		tags = "[Class] [Branch]";
		frequency = "At-Will - Extended Action";
		effect = "Target: Your Pokemon with at least 2 Tutor Points remaining. Effect: The target loses 2 Tutor Points and learns Freezing Pointor Type Strategist Ability for Ice. You may target a Pokemon only once with IceAce.";
		prereqs.put("2 Different Pokemon of Ice Type", 0);
		prereqs.put("Athletics OR Survival at Novice OR Elemental Connection (Bug)", 0);
		prereqs.put("1 Pokemon of the chosen Type", 0);
		prereqs.put("Athletics OR Survival at Novice.", 0);
	}
	public Ice_Ace(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Athletics", 3) || t.checkSkillRank("Survival", 3);
	}
}