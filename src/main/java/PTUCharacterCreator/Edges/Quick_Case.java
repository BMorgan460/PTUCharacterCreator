package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Quick_Case extends Edge {
	{
		name = "Quick Case";
		effect = "You may remove a Case from a Poke Ball as a Swift Action. You may apply a Case to a Poke Ball as a Shift Action. (Normally these would be Shift and Standard Actions respectively.)";
		prereqs.put("Tech Edu", 3);
	}
	public Quick_Case(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Tech Edu",3) && true;
	}
}