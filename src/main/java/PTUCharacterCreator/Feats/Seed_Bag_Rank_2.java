package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Seed_Bag_Rank_2 extends Feature {
	{
		name = "Seed Bag Rank 2";
		tags = "[Botany Research Field] [Branch] [Ranked 2]";
		frequency = "Static";
		effect = "You may also harvest Cotton Spore, Leech Seed, Spore, or Worry Seed.";
		prereqs.put("Gen Edu", 6);
		prereqs.put("Survival", 6);
	}
	public Seed_Bag_Rank_2(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Gen Edu",6) && t.checkSkillRank("Survival",6);
	}
}