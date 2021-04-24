package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Master_Skills_Ocu_Ed extends Edge {
	{
		name = "Master Skills Ocu Ed";
		effect = "You Rank Up a Skill from Expert to Master. You may take this Edge multiple times.";
		prereqs.put("Level 12", -2);
		prereqs.put("Expert Ocu Ed", 0);
	}
	public Master_Skills_Ocu_Ed(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.aboveLevel(12) && true;
	}
}