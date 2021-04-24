package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Crystal_Artificer extends Feature {
	{
		name = "Crystal Artificer";
		tags = "[Artificer Research Field] [Branch]";
		frequency = "At-Will - Extended Action";
		effect = "You may use any Crystal Artificer Recipe for which you qualify. Recipes - Type Booster, Type Brace";
		prereqs.put("Gem Lore", -3);
	}
	public Crystal_Artificer(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasEdge("Gem Lore");
	}
}