package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Type_Ace extends Feature {
	{
		name = "Type Ace";
		tags = "[Class] [Branch]";
		frequency = "At-Will - Extended Action";
		effect = "Target: Your Pokemon with at least 2 Tutor Points remaining. Effect: The target loses 2 Tutor Points and learns the Last Chance or Type Strategist Ability for your Chosen Type. You may target a Pokemon only once with Type Ace.";
		prereqs.put("2 Different Pokemon of the chosen Type", 0);
		prereqs.put("Type-Linked Skill at Novice OR Elemental Connection (of the chosen Type)", 0);
		prereqs.put("1 Pokemon of the chosen Type", 0);
		prereqs.put("Type-Linked Skill at Novice.", 0);
	}
	public Type_Ace(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return false;
	}
}