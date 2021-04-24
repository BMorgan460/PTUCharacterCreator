package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Mystic_Defense extends Feature {
	{
		name = "Mystic Defense";
		tags = "[+HP]";
		frequency = "Static";
		effect = "You learn the Moves Light Screen and Safeguard.";
		prereqs.put("Sage", -1);
	}
	public Mystic_Defense(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Sage");
	}
}