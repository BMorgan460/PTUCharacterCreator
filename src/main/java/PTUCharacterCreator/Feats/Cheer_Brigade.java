package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Cheer_Brigade extends Feature {
	{
		name = "Cheer Brigade";
		tags = "";
		frequency = "At-Will - Extended Action";
		effect = "Target: Your Pokemon with at least 2 Tutor Points remaining Effect: Your Pokemon loses 2 Tutor Points and gains the Friend Guard Ability.";
		prereqs.put("Cheerleader", -1);
	}
	public Cheer_Brigade(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Cheerleader");
	}
}