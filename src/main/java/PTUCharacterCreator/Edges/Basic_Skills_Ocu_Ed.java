package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Basic_Skills_Ocu_Ed extends Edge {
	{
		name = "Basic Skills Ocu Ed";
		effect = "You Rank Up a Skill from Pathetic to Untrained, or Untrained to Novice. You may take this Edge multiple times.";
		prereqs.put("-", 0);
	}
	public Basic_Skills_Ocu_Ed(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return true;
	}
}