package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Guidance extends Feature {
	{
		name = "Guidance";
		tags = "";
		frequency = "Static";
		effect = "Your Pokemons base Move List limit is increased by +1 (Reminder: The default Move List Limit is 6).";
		prereqs.put("Mentor", -1);
	}
	public Guidance(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Mentor");
	}
}