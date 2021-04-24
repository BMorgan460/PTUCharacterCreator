package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Work_Up extends Edge {
	{
		name = "Work Up";
		effect = "You learn the move Work Up.";
		prereqs.put("Focus", 4);
	}
	public Work_Up(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Focus",4) && true;
	}
}