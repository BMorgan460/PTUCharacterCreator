package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Backpacker extends Feature {
	{
		name = "Backpacker";
		tags = "[Class] [+Speed] [5-15 Playtest]";
		frequency = "Static";
		effect = "You gain the Skill Enhancement Edge. You then gain an instance of the Skill Stunt Edge for each of the two Skills you chose with Skill Enhancement.";
		prereqs.put("Traveler", -3);
	}
	public Backpacker(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasEdge("Traveler");
	}
}