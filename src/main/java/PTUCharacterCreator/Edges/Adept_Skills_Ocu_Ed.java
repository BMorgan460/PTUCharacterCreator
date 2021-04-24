package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Adept_Skills_Ocu_Ed extends Edge {
	{
		name = "Adept Skills Ocu Ed";
		effect = "You Rank Up a Skill from Novice to Adept. You may take this Edge multiple times.";
		prereqs.put("Level 2", -2);
		prereqs.put("Novice Ocu Ed", 0);
	}
	public Adept_Skills_Ocu_Ed(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.aboveLevel(2) && true;
	}
}