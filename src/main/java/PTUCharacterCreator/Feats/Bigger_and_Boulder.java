package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Bigger_and_Boulder extends Feature {
	{
		name = "Bigger and Boulder";
		tags = "";
		frequency = "Scene x2 - Free Action";
		effect = "Trigger: Your Pokemon hits with a damaging Rock-Type Move Effect: All targets hit by the triggering Move are pushed a number of meters equal to half your Type-Linked Skill Rank or less, and they become Vulnerable for one full round. Create a Stealth Rock Hazard adjacent to each foe hit this way.";
		prereqs.put("Gravel Before Me", -1);
		prereqs.put("Type-Linked Skill at Adept", 0);
	}
	public Bigger_and_Boulder(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Gravel Before Me");
	}
}