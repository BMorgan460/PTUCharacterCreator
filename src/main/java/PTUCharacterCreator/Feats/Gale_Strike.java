package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Gale_Strike extends Feature {
	{
		name = "Gale Strike";
		tags = "";
		frequency = "Scene x2 - Free Action";
		effect = "Trigger: Your Pokemon uses a Flying-Type Move with an Accuracy Check Effect: You may roll the Accuracy Check twice, and resolve using either result. If both results would hit and you resolve the attack using the lower result, Gale Strikes Frequency is not expended.";
		prereqs.put("Celerity", -1);
		prereqs.put("Type-Linked Skill at Adept", 0);
	}
	public Gale_Strike(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Celerity");
	}
}