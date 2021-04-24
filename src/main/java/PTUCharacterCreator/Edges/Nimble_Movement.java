package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Nimble_Movement extends Edge {
	{
		name = "Nimble Movement";
		effect = "Whenever you Disengage, you Shift 2 meters instead of 1.";
		prereqs.put("Acrobatics or Stealth", 4);
	}
	public Nimble_Movement(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Acrobatics",4) || t.checkSkillRank("Stealth",4);
	}
}