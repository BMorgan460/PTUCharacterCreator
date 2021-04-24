package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Strange_Energy extends Feature {
	{
		name = "Strange Energy";
		tags = "[+Speed]";
		frequency = "Static";
		effect = "You learn the Moves Heal Block and Magic Coat.";
		prereqs.put("Warping Ground", -1);
		prereqs.put("Space Distortion", -1);
	}
	public Strange_Energy(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Warping Ground") && t.hasFeat("Space Distortion");
	}
}