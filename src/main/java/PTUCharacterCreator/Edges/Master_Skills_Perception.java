package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Master_Skills_Perception extends Edge {
	{
		name = "Master Skills Perception";
		effect = "You Rank Up a Skill from Expert to Master. You may take this Edge multiple times.";
		prereqs.put("Level 12", -2);
		prereqs.put("Perception", 5);
	}
	public Master_Skills_Perception(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.aboveLevel(12) && t.checkSkillRank("Perception",5) && true;
	}
}