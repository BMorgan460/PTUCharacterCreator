package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Heros_Journey_Rank_4 extends Feature {
	{
		name = "Hero's Journey Rank 4";
		tags = "[Ranked 4] [+Speed] [5-15 Playtest]";
		frequency = "Static";
		effect = "Each Rank, you may gain two Backpacker Talents for which you qualify.";
		prereqs.put("Backpacker", -1);
		prereqs.put("Survival", 5);
	}
	public Heros_Journey_Rank_4(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Backpacker") && t.checkSkillRank("Survival",5);
	}
}