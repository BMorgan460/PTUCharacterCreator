package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Demoralize extends Edge {
	{
		name = "Demoralize";
		effect = "Whenever you land a Critical Hit on a foe, that foe becomes Vulnerable. Status-Class Moves with an Accuracy Roll can Crit for the purposes of activating this effect on a natural roll of 19 or higher, and any effects that expand your Critical-Hit Range also expand this range.";
		prereqs.put("Intimidate", 4);
	}
	public Demoralize(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Intimidate",4) && true;
	}
}