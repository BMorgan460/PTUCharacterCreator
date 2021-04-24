package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Basic_Skills_Command extends Edge {
	{
		name = "Basic Skills Command";
		effect = "You Rank Up a Skill from Pathetic to Untrained, or Untrained to Novice. You may take this Edge multiple times.";
		prereqs.put("-", 0);
	}
	public Basic_Skills_Command(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return true;
	}
}