package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Flustering_Charisma extends Edge {
	{
		name = "Flustering Charisma";
		effect = "When you hit with a Move with the Social keyword, the target takes a -2 penalty to Save Checks against Volatile Status Afflictions for 1 full round.";
		prereqs.put("Charm or Guile", 4);
	}
	public Flustering_Charisma(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Charm",4) || t.checkSkillRank("Guile",4);
	}
}