package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Confidence_Artist extends Edge {
	{
		name = "Confidence Artist";
		effect = "You learn the move Confide.";
		prereqs.put("Guile", 3);
	}
	public Confidence_Artist(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Guile",3) && true;
	}
}