package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Dream_Architect extends Edge {
	{
		name = "Dream Architect";
		effect = "You know how to operate Dream Machines and can use them to study and influence a Pokemon�s dreams.";
		prereqs.put("Poke Edu, Tech Edu, or Intuition", 4);
	}
	public Dream_Architect(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Poke Edu",4) || t.checkSkillRank("Tech Edu",4) || t.checkSkillRank("Intuition",4);
	}
}