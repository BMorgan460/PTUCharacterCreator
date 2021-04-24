package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Raging_Winds_Rank_3 extends Feature {
	{
		name = "Raging Winds Rank 3";
		tags = "[Ranked 3] [+Speed]";
		frequency = "Static";
		effect = "You may learn two Moves from the list below, marked with the Raging Winds Rank you are gaining or lower. Rank 3 Moves: Brave Bird, Hurricane, Mirror Move, Sky Attack";
		prereqs.put("Acrobatics", 6);
		prereqs.put("Perception", 6);
	}
	public Raging_Winds_Rank_3(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Acrobatics",6) && t.checkSkillRank("Perception",6);
	}
}