package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Warping_Ground extends Feature {
	{
		name = "Warping Ground";
		tags = "[+Speed]";
		frequency = "Static";
		effect = "You learn the Moves Gravity and Trick.";
		prereqs.put("Warper", -1);
	}
	public Warping_Ground(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Warper");
	}
}