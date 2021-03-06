package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Seed_Bag_Rank_1 extends Feature {
	{
		name = "Seed Bag Rank 1";
		tags = "[Botany Research Field] [Branch] [Ranked 2]";
		frequency = "X Daily - Extended Action";
		effect = "Target: A Willing Pokemon Effect: You become adept at harvesting Seeds and Spores from Pokemon. You may target a willing Grass-Type Pokemon that knows Sleep Powder, Stun Spore, or Poison Powder. Add this move to your Move list for the remainder of the day. You may not use Seed Bag to have multiple instances of the same move in your Move list. Seed Bag may be used twice per day per Rank.";
		prereqs.put("Green Thumb", -3);
		prereqs.put("Gen Edu", 4);
		prereqs.put("Survival", 4);
	}
	public Seed_Bag_Rank_1(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasEdge("Green Thumb") && t.checkSkillRank("Gen Edu",4) && t.checkSkillRank("Survival",4);
	}
}