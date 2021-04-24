package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class How_To_Shoot_Web extends Feature {
	{
		name = "How To Shoot Web";
		tags = "";
		frequency = "Static";
		effect = "You gain the Threaded and Wallclimber Capabilities.";
		prereqs.put("Swarmlord", -1);
	}
	public How_To_Shoot_Web(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Swarmlord");
	}
}