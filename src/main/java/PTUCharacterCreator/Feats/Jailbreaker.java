package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Jailbreaker extends Feature {
	{
		name = "Jailbreaker";
		tags = "[Jailbreaker Research Field]";
		frequency = "At-Will - Extended Action";
		effect = "You may craft any Poke Ball Case Recipe for which you qualify. Recipe - Basic Cases";
		prereqs.put("Basic Balls", -3);
	}
	public Jailbreaker(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasEdge("Basic Balls");
	}
}