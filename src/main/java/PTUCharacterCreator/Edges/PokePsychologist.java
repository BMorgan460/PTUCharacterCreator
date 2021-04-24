package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class PokePsychologist extends Edge {
	{
		name = "PokePsychologist";
		effect = "You may use your Pokemon Education Skill instead of Charm, Guile, Intimidate, or Intuition when making general Skill checks to interact with Pokemon or to raise or lower disposition.";
		prereqs.put("Poke Edu", 3);
	}
	public PokePsychologist(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Poke Edu",3) && true;
	}
}