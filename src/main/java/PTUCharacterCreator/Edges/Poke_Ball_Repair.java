package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Poke_Ball_Repair extends Edge {
	{
		name = "Poke Ball Repair";
		effect = "You may attempt to fix any Poke Ball that has failed to capture a Pokemon and broke. Make a Technology Check with a DC of 15. If you succeed, the Poke Ball is fixed and is treated as if it had not broken. If you fail, the ball is permanently broken. Requires access to a Poke Ball Tool Box.";
		prereqs.put("Basic Balls or Apricorn Balls", 0);
	}
	public Poke_Ball_Repair(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasEdge("Basic Balls") || t.hasEdge("Apricorn Balls");
	}
}