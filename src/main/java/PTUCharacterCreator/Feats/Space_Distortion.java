package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Space_Distortion extends Feature {
	{
		name = "Space Distortion";
		tags = "[+Speed]";
		frequency = "Static";
		effect = "You learn the Moves Teleport and Ally Switch.";
		prereqs.put("Warper", -1);
	}
	public Space_Distortion(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Warper");
	}
}