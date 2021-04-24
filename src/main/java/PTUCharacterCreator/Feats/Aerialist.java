package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Aerialist extends Feature {
	{
		name = "Aerialist";
		tags = "[+Speed]";
		frequency = "Static";
		effect = "You learn the Moves Aerial Ace and Splash.";
		prereqs.put("Tumbler", -1);
	}
	public Aerialist(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Tumbler");
	}
}