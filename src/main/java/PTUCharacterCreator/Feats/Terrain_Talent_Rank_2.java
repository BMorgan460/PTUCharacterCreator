package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Terrain_Talent_Rank_2 extends Feature {
	{
		name = "Terrain Talent Rank 2";
		tags = "[Ranked 2][+HP]";
		frequency = "Static";
		effect = "You gain two Terrain Talents, chosen from the Terrains for which you gained Naturewalk from Survivalist.";
		prereqs.put("Survivalist", -1);
		prereqs.put("Survival", 6);
		prereqs.put("4 Mastered Terrains", 0);
	}
	public Terrain_Talent_Rank_2(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Survivalist") && t.checkSkillRank("Survival",6);
	}
}