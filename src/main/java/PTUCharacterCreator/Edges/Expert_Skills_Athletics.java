package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Expert_Skills_Athletics extends Edge {
	{
		name = "Expert Skills Athletics";
		effect = "You Rank Up a Skill from Adept to Expert. You may take this Edge multiple times.";
		prereqs.put("Level 6", -2);
		prereqs.put("Athletics", 4);
	}
	public Expert_Skills_Athletics(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.aboveLevel(6) && t.checkSkillRank("Athletics",4) && true;
	}
}