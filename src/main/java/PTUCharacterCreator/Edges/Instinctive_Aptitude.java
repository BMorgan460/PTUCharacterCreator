package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Instinctive_Aptitude extends Edge {
	{
		name = "Instinctive Aptitude";
		effect = "Whenever you spend AP to raise your roll on an Accuracy Roll or Skill Check, you get a +2 bonus instead of +1. This cannot be used on Rolls made by your Pokemon.";
		prereqs.put("Intuition", 4);
	}
	public Instinctive_Aptitude(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Intuition",4) && true;
	}
}