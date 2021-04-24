package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Overwatch extends Feature {
	{
		name = "Overwatch";
		tags = "[+Attack][Weapon]";
		frequency = "At-Will - Standard Action";
		effect = "Create a Line X, and place a Blast 3 with at least three meters overlapping the Lines area. X is equal to your Weapons Range. For one full round, if a foe moves in or out of that area, you may make a Ranged Weapon attack, Frequency allowing, against that foe as a Free Action. You may not attack a specific foe more than once per round this way. While this is in effect, if you Move from your current location, Overwatchs effect is lost.";
		prereqs.put("Marksman", -1);
		prereqs.put("Combat", 4);
		prereqs.put("Perception", 4);
	}
	public Overwatch(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Marksman") && t.checkSkillRank("Combat",4) && t.checkSkillRank("Perception",4);
	}
}