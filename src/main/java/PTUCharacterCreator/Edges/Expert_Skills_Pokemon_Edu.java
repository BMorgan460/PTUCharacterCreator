package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Expert_Skills_Pokemon_Edu extends Edge {
	{
		name = "Expert Skills Pokemon Edu";
		effect = "You Rank Up a Skill from Adept to Expert. You may take this Edge multiple times.";
		prereqs.put("Level 6", -2);
		prereqs.put("Adept Pokemon Edu", 0);
	}
	public Expert_Skills_Pokemon_Edu(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.aboveLevel(6) && true;
	}
}