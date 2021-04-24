package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Polished_Shine extends Feature {
	{
		name = "Polished Shine";
		tags = "";
		frequency = "Static";
		effect = "The Effect Range of your Pokemons Steel-Type Moves is increased by +2.";
		prereqs.put("Type Ace", -1);
		prereqs.put("Steel as Chosen Type", 0);
	}
	public Polished_Shine(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Type Ace");
	}
}