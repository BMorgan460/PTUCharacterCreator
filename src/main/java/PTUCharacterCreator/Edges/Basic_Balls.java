package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Basic_Balls extends Edge {
	{
		name = "Basic Balls";
		effect = "You may craft Basic Balls for $100 and Great Balls for $175. Requires access to a Poke Ball Tool Box.";
		prereqs.put("Tech Edu", 3);
	}
	public Basic_Balls(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Tech Edu",3) && true;
	}
}