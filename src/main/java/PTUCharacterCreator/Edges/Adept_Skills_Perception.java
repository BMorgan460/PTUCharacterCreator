package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Adept_Skills_Perception extends Edge {
	{
		name = "Adept Skills Perception";
		effect = "You Rank Up a Skill from Novice to Adept. You may take this Edge multiple times.";
		prereqs.put("Level 2", -2);
		prereqs.put("Perception", 3);
	}
	public Adept_Skills_Perception(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.aboveLevel(2) && t.checkSkillRank("Perception",3) && true;
	}
}