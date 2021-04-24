package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Master_Skills_Pokemon_Edu extends Edge {
	{
		name = "Master Skills Pokemon Edu";
		effect = "You Rank Up a Skill from Expert to Master. You may take this Edge multiple times.";
		prereqs.put("Level 12", -2);
		prereqs.put("Expert Pokemon Edu", 0);
	}
	public Master_Skills_Pokemon_Edu(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.aboveLevel(12) && true;
	}
}