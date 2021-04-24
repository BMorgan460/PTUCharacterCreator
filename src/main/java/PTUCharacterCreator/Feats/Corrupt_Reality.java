package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Corrupt_Reality extends Feature {
	{
		name = "Corrupt Reality";
		tags = "[+Special Defense]";
		frequency = "Scene - Free Action";
		effect = "Target: Any roll made by an enemy Effect: You may force the enemy to reroll that roll.";
		prereqs.put("Glitch Bender", -1);
		prereqs.put("Perception", 4);
	}
	public Corrupt_Reality(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Glitch Bender") && t.checkSkillRank("Perception",4);
	}
}