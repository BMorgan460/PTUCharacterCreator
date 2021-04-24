package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Shock_Resistance extends Edge {
	{
		name = "Shock Resistance";
		effect = "You don’t suffer Augmentation Shock from Electric Type damage unless it is Massive Damage.";
		prereqs.put("Tech Edu", 3);
	}
	public Shock_Resistance(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Tech Edu",3) && true;
	}
}