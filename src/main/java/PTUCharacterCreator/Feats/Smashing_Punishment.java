package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Smashing_Punishment extends Feature {
	{
		name = "Smashing Punishment";
		tags = "";
		frequency = "Daily x3 - Free Action";
		effect = "Trigger: A Marked Foe provokes an Attack of Opportunity from your Fighting-Type Pokemon Effect: The Attack of Opportunity automatically hits, deals Fighting-Type Damage, and is a Critical Hit.";
		prereqs.put("Close Quarters Mastery", -1);
		prereqs.put("Type-Linked Skill at Master", 0);
	}
	public Smashing_Punishment(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Close Quarters Mastery");
	}
}