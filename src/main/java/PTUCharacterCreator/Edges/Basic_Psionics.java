package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Basic_Psionics extends Edge {
	{
		name = "Basic Psionics";
		effect = "You learn the move Confusion.";
		prereqs.put("Elemental Connection (Psychic)", 0);
	}
	public Basic_Psionics(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return true;
	}
}