package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Kip_Up extends Edge {
	{
		name = "Kip Up";
		effect = "You may stand up from being Tripped as a Swift Action.";
		prereqs.put("Acrobatics", 5);
	}
	public Kip_Up(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Acrobatics",5) && true;
	}
}