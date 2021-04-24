package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Raging_Winds_Rank_2 extends Feature {
	{
		name = "Raging Winds Rank 2";
		tags = "[Ranked 3] [+Speed]";
		frequency = "Static";
		effect = "You may learn two Moves from the list below, marked with the Raging Winds Rank you are gaining or lower. Rank 2 Moves: Air Slash, Bounce, Defog, Feather Dance";
		prereqs.put("Acrobatics", 5);
		prereqs.put("Perception", 5);
	}
	public Raging_Winds_Rank_2(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Acrobatics",5) && t.checkSkillRank("Perception",5);
	}
}