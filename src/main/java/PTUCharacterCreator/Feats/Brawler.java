package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Brawler extends Feature {
	{
		name = "Brawler";
		tags = "";
		frequency = "Scene x2 - Free Action";
		effect = "Trigger: Your Pokemon makes a Struggle Attack Effect: This Struggle Attack has a range of Burst 1, Friendly instead of the usual range, and deals Fighting-Type Damage.";
		prereqs.put("Close Quarters Mastery", -1);
		prereqs.put("Type-Linked Skill at Adept", 0);
	}
	public Brawler(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Close Quarters Mastery");
	}
}