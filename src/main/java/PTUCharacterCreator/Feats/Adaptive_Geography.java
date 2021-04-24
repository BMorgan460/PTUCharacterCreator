package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Adaptive_Geography extends Feature {
	{
		name = "Adaptive Geography";
		tags = "[+HP]";
		frequency = "Scene x2 - Free Action";
		effect = "Trigger: You or your Pokemon gains Initiative Effect: The triggering target takes their turn as if they were in a terrain adjacent to the terrain they are in on the following list. For example, if you are standing in Wetlands terrain, you may act as if you are standing in Forest or Ocean Terrain. This affects Survivalist Features, Naturewalk Capabilities, Moves with the Environ Keyword, etc. Grassland - Forest - Wetlands - Ocean - Tundra - Mountain - Cave - Urban - Desert - Grassland";
		prereqs.put("Survival", 6);
	}
	public Adaptive_Geography(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Survival",6);
	}
}