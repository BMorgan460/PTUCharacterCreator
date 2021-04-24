package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Charmer extends Edge {
	{
		name = "Charmer";
		effect = "You learn the move Baby-Doll Eyes.";
		prereqs.put("Charm", 3);
	}
	public Charmer(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Charm",3) && true;
	}
}