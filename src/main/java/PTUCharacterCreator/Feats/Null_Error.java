package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Null_Error extends Feature {
	{
		name = "Null Error";
		tags = "[+Special Defense]";
		frequency = "Static";
		effect = "You learn the Moves Snatch and Disable.";
		prereqs.put("Glitch Bender", -1);
	}
	public Null_Error(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Glitch Bender");
	}
}