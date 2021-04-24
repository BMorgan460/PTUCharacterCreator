package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Athletic_Initiative extends Edge {
	{
		name = "Athletic Initiative";
		effect = "You learn the move Agility.";
		prereqs.put("Athletics", 4);
	}
	public Athletic_Initiative(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Athletics",4) && true;
	}
}