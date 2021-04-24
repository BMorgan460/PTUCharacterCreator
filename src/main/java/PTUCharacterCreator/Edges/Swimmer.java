package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Swimmer extends Edge {
	{
		name = "Swimmer";
		effect = "You gain a +2 bonus to your Swim Speed. You may spend X minutes underwater before you begin to suffocate, where X is the higher of your Athletics or Survival Ranks.";
		prereqs.put("Athletics or Survival", 3);
	}
	public Swimmer(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Athletics",3) || t.checkSkillRank("Survival",3);
	}
}