package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Soulbound extends Edge {
	{
		name = "Soulbound";
		effect = "Whenever your Patron feels strong emotions (positive or negative) or pain, those sensations will be shared with you, no matter the distance between you. You may take Soulbound multiple times, each time for a different instance of Touched.";
		prereqs.put("Touched", -1);
	}
	public Soulbound(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasEdge("Touched") && true;
	}
}