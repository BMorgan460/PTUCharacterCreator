package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Power_Boost extends Edge {
	{
		name = "Power Boost";
		effect = "Increase your Power Capability by +2.";
		prereqs.put("Athletics", 5);
	}
	public Power_Boost(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Athletics",5) && true;
	}
}