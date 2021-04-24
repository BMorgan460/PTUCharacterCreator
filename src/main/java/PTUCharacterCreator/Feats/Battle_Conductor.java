package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Battle_Conductor extends Feature {
	{
		name = "Battle Conductor";
		tags = "";
		frequency = "At-Will - Swift Action";
		effect = "Trigger: You give [Orders] with a Frequency of At-Will that have targets Effect: You may target up to two additional Allies with the [Orders].";
		prereqs.put("Leadership", -1);
	}
	public Battle_Conductor(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Leadership");
	}
}