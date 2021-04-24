package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Basic_Martial_Arts extends Edge {
	{
		name = "Basic Martial Arts";
		effect = "You learn the move Rock Smash.";
		prereqs.put("Combat", 3);
	}
	public Basic_Martial_Arts(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Combat",3) && true;
	}
}