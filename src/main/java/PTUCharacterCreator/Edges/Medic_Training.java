package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Medic_Training extends Edge {
	{
		name = "Medic Training";
		effect = "When you use Restorative Items on others, they do not forfeit their next turn.";
		prereqs.put("Med Edu", 3);
	}
	public Medic_Training(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Med Edu",3) && true;
	}
}