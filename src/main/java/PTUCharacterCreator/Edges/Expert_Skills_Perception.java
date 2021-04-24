package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Expert_Skills_Perception extends Edge {
	{
		name = "Expert Skills Perception";
		effect = "You Rank Up a Skill from Adept to Expert. You may take this Edge multiple times.";
		prereqs.put("Level 6", -2);
		prereqs.put("Perception", 4);
	}
	public Expert_Skills_Perception(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.aboveLevel(6) && t.checkSkillRank("Perception",4) && true;
	}
}