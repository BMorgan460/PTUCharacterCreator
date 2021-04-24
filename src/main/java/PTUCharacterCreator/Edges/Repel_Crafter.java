package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Repel_Crafter extends Edge {
	{
		name = "Repel Crafter";
		effect = "Create a Repel for $100 or a Super Repel for $150. Requires access to a Chemistry Set.";
		prereqs.put("Med or Tech Edu", 3);
	}
	public Repel_Crafter(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Tech Edu",3) || t.checkSkillRank("Med Edu",3);
	}
}