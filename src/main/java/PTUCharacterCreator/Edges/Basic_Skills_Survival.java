package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Basic_Skills_Survival extends Edge {
	{
		name = "Basic Skills Survival";
		effect = "You Rank Up a Skill from Pathetic to Untrained, or Untrained to Novice. You may take this Edge multiple times.";
		prereqs.put("-", 0);
	}
	public Basic_Skills_Survival(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return true;
	}
}