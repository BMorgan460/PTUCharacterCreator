package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Expert_Skills_Ocu_Ed extends Edge {
	{
		name = "Expert Skills Ocu Ed";
		effect = "You Rank Up a Skill from Adept to Expert. You may take this Edge multiple times.";
		prereqs.put("Level 6", -2);
		prereqs.put("Adept Ocu Ed", 0);
	}
	public Expert_Skills_Ocu_Ed(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.aboveLevel(6) && true;
	}
}