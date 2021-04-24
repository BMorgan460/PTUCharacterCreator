package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Glitched_Existence extends Edge {
	{
		name = "Glitched Existence";
		effect = "You gain +2 to all Skill rolls to deal with Glitch phenomena.";
		prereqs.put("Exposure to Glitch Phenomena", 0);
		prereqs.put(" GM Permission", 0);
	}
	public Glitched_Existence(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return true;
	}
}