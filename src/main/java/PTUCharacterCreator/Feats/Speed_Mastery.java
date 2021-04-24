package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Speed_Mastery extends Feature {
	{
		name = "Speed Mastery";
		tags = "[Branch]";
		frequency = "Static";
		effect = "Your Pokemon may take Disengage Maneuvers as Swift Actions.";
		prereqs.put("Stat Maneuver", -1);
	}
	public Speed_Mastery(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Speed Maneuver");
	}
}