package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Dumplings extends Feature {
	{
		name = "Dumplings";
		tags = "";
		frequency = "At-Will - Extended Action";
		effect = "Ingredient 1: Leftovers, Preserves, or a Snack made with Chef Ingredient 2: Leftovers or Preserves Effect: You mix the two ingredients into one Snack that has the same effect as its ingredients. The two ingredients must be different items. May Playtest Errata: Dumplings cannot be used to make other Dumpling items.";
		prereqs.put("4 Chef Features", 0);
		prereqs.put("Intuition", 6);
	}
	public Dumplings(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Intuition",6);
	}
}