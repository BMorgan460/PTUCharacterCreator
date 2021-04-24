package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Sacred_Shield extends Feature {
	{
		name = "Sacred Shield";
		tags = "[+HP]";
		frequency = "Static";
		effect = "You learn the Moves Reflect and Lucky Chant.";
		prereqs.put("Sage", -1);
	}
	public Sacred_Shield(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Sage");
	}
}