package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Extra_Ordinary extends Feature {
	{
		name = "Extra Ordinary";
		tags = "";
		frequency = "At-Will - Extended Action";
		effect = "Target: Your Normal-Type Pokemon with Last Chance or Normal Strategist Effect: Your Pokemon gains the Last Chance or Normal Strategist Ability, whichever one they do not already have. Extra Ordinary can target a Pokemon only once.";
		prereqs.put("Type Ace", -1);
		prereqs.put("Normal as Chosen Type", 0);
	}
	public Extra_Ordinary(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Type Ace");
	}
}