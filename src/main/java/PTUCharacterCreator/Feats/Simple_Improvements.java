package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Simple_Improvements extends Feature {
	{
		name = "Simple Improvements";
		tags = "";
		frequency = "Daily x3 - Free Action";
		effect = "Trigger: Your Normal-Type Pokemon gains Initiative Effect: Add your Type-Linked Skill Rank to all of your Pokemons rolls this turn. Your Pokemon gains Temporary Hit Points equal to twice your Type-Linked Skill Rank. Simple Improvements may only be used once per Scene per Pokemon.";
		prereqs.put("Extra Ordinary", -1);
		prereqs.put("Type-Linked Skill at Master", 0);
	}
	public Simple_Improvements(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Extra Ordinary");
	}
}