package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Engineer extends Feature {
	{
		name = "Engineer";
		tags = "[Engineer Researcher Field]";
		frequency = "Static";
		effect = "You may craft any Engineer Recipe for which you qualify. Recipe - Robotics 101";
		prereqs.put("Pokebot Training", -3);
	}
	public Engineer(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasEdge("Pokebot Training");
	}
}