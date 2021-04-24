package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Dynamism extends Edge {
	{
		name = "Dynamism";
		effect = "Your initiative is increased by your Guile Rank.";
		prereqs.put("Guile", 3);
	}
	public Dynamism(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Guile",3) && true;
	}
}