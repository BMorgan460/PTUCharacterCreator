package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Iron_Mind extends Edge {
	{
		name = "Iron Mind";
		effect = "You become aware of all attempts to read your mind with Telepathy, whether the attempt is successful or not.";
		prereqs.put("Focus", 3);
	}
	public Iron_Mind(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Focus",3) && true;
	}
}