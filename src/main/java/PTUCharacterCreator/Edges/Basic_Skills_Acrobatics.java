package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Basic_Skills_Acrobatics extends Edge {
	{
		name = "Basic Skills Acrobatics";
		effect = "You Rank Up a Skill from Pathetic to Untrained, or Untrained to Novice. You may take this Edge multiple times.";
		prereqs.put("-", 0);
	}
	public Basic_Skills_Acrobatics(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return true;
	}
}