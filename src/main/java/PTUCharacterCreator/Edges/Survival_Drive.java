package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Survival_Drive extends Edge {
	{
		name = "Survival Drive";
		effect = "You learn the move Bulk Up.";
		prereqs.put("Survival", 4);
	}
	public Survival_Drive(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Survival",4) && true;
	}
}