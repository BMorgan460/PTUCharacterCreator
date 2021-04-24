package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Pokebot_Training extends Edge {
	{
		name = "Pokebot Training";
		effect = "You may control a Pokebot with Complexity up to your Technology Rank by using a Pokemon turn.";
		prereqs.put("Tech Edu", 3);
	}
	public Pokebot_Training(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Tech Edu",3) && true;
	}
}