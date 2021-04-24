package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Leader extends Edge {
	{
		name = "Leader";
		effect = "You learn the move After You.";
		prereqs.put("Command", 4);
	}
	public Leader(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Command",4) && true;
	}
}