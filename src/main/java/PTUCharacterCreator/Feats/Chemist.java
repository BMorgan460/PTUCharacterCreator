package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Chemist extends Feature {
	{
		name = "Chemist";
		tags = "[Chemistry Research Field] [Branch]";
		frequency = "At-Will - Extended Action";
		effect = "You may craft any Chemistry Recipe for which you qualify. Recipes - Enhancers, Pester Balls: Disorient";
		prereqs.put("Repel Crafter", -3);
	}
	public Chemist(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasEdge("Repel Crafter");
	}
}