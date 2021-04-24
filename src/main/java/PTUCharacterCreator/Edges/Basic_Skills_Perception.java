package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Basic_Skills_Perception extends Edge {
	{
		name = "Basic Skills Perception";
		effect = "You Rank Up a Skill from Pathetic to Untrained, or Untrained to Novice. You may take this Edge multiple times.";
		prereqs.put("-", 0);
	}
	public Basic_Skills_Perception(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return true;
	}
}