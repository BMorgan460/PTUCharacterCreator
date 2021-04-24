package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Art_of_Stealth extends Edge {
	{
		name = "Art of Stealth";
		effect = "You gain the Stealth Capability.";
		prereqs.put("Stealth", 5);
	}
	public Art_of_Stealth(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Stealth",5) && true;
	}
}