package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Crystal_Resonance extends Feature {
	{
		name = "Crystal Resonance";
		tags = "[Artificer Research Field] [Branch]";
		frequency = "Static";
		effect = "You roll an additional 3d6 when determining how many Shards you find when Dowsing. Recipes - Focus Gem, Chakra Crystal";
		prereqs.put("Crystal Artificer", -1);
		prereqs.put("Skill Stunt (Dowsing)", 0);
	}
	public Crystal_Resonance(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Crystal Artificer");
	}
}