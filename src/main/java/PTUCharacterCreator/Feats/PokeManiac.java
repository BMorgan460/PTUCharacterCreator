package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class PokeManiac extends Feature {
	{
		name = "PokeManiac";
		tags = "";
		frequency = "At-Will - Standard Action";
		effect = "Target: A Pokemon Effect: Make a Pokemon Education Check with a DC of 10. If you succeed, you determine the targets Level, Types, Nature, and Abilities.";
		prereqs.put("Poke Edu", 4);
	}
	public PokeManiac(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Poke Edu",4);
	}
}