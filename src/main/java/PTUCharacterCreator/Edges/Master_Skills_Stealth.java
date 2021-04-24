package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Master_Skills_Stealth extends Edge {
	{
		name = "Master Skills Stealth";
		effect = "You Rank Up a Skill from Expert to Master. You may take this Edge multiple times.";
		prereqs.put("Level 12", -2);
		prereqs.put("Stealth", 5);
	}
	public Master_Skills_Stealth(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.aboveLevel(12) && t.checkSkillRank("Stealth",5) && true;
	}
}