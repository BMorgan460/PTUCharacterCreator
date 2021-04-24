package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Gneiss_Aim extends Feature {
	{
		name = "Gneiss Aim";
		tags = "";
		frequency = "Daily x3 - Free Action";
		effect = "Trigger: Your Pokemon misses with a Damaging Rock- Type Move Effect: The Move gains the Smite keyword for that use.";
		prereqs.put("Gravel Before Me", -1);
		prereqs.put("Type-Linked Skill at Master", 0);
	}
	public Gneiss_Aim(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Gravel Before Me");
	}
}