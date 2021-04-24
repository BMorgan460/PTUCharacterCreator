package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Terrain_Talent_Rank_1 extends Feature {
	{
		name = "Terrain Talent Rank 1";
		tags = "[Ranked 2][+HP]";
		frequency = "Static";
		effect = "You gain two Terrain Talents, chosen from the Terrains for which you gained Naturewalk from Survivalist. »» Grassland: Plains Runner »» Forest: Forest Ranger »» Wetlands: Marsh Stomper »» Ocean: Deep Diver »» Tundra: Arctic Pilgrim »» Mountain: Surefooted »» Cave: Cave Dweller »» Urban: Traceur »» Desert: Dune Walker";
		prereqs.put("Survivalist", -1);
		prereqs.put("2 Mastered Terrains", 0);
	}
	public Terrain_Talent_Rank_1(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Survivalist");
	}
}