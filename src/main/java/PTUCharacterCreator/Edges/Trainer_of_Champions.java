package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Trainer_of_Champions extends Edge {
	{
		name = "Trainer of Champions";
		effect = "Whenever you apply Experience Training to a Pokemon, they gain an additional +5 Experience.";
		prereqs.put("Command", 5);
	}
	public Trainer_of_Champions(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Command",5) && true;
	}
}