package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Master_Skills_Gen_Edu extends Edge {
	{
		name = "Master Skills Gen Edu";
		effect = "You Rank Up a Skill from Expert to Master. You may take this Edge multiple times.";
		prereqs.put("Level 12", -2);
		prereqs.put("Gen Edu", 5);
	}
	public Master_Skills_Gen_Edu(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.aboveLevel(12) && t.checkSkillRank("Gen Edu",5) && true;
	}
}