package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Nimble_Steps extends Feature {
	{
		name = "Nimble Steps";
		tags = "[+Speed]";
		frequency = "Static";
		effect = "You may perform the Disengage Maneuver as a Swift Action.";
		prereqs.put("Skirmisher", -1);
	}
	public Nimble_Steps(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Skirmisher");
	}
}