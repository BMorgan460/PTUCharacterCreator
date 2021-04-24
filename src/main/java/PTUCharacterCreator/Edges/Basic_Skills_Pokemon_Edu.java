package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Basic_Skills_Pokemon_Edu extends Edge {
	{
		name = "Basic Skills Pokemon Edu";
		effect = "You Rank Up a Skill from Pathetic to Untrained, or Untrained to Novice. You may take this Edge multiple times.";
		prereqs.put("-", 0);
	}
	public Basic_Skills_Pokemon_Edu(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return true;
	}
}