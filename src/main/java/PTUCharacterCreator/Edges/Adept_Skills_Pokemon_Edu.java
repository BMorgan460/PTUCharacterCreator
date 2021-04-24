package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Adept_Skills_Pokemon_Edu extends Edge {
	{
		name = "Adept Skills Pokemon Edu";
		effect = "You Rank Up a Skill from Novice to Adept. You may take this Edge multiple times.";
		prereqs.put("Level 2", -2);
		prereqs.put("Novice Pokemon Edu", 0);
	}
	public Adept_Skills_Pokemon_Edu(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.aboveLevel(2) && true;
	}
}