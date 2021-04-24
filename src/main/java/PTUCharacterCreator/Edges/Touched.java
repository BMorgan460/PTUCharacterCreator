package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Touched extends Edge {
	{
		name = "Touched";
		effect = "You have been blessed by a Legendary and gain their Minor Gift. This Legendary is considered one of your Patrons. You may take Touched multiple times, each time for a different Patron.";
		prereqs.put("GM Permission", 0);
	}
	public Touched(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return true;
	}
}