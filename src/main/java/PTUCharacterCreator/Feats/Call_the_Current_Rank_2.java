package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Call_the_Current_Rank_2 extends Feature {
	{
		name = "Call the Current Rank 2";
		tags = "[Ranked 3] [+Speed]";
		frequency = "Static";
		effect = "You learn 2 Moves chosen from the list below, marked with the Rank of this Feature you are gaining or lower. Rank 2 Moves: Bubblebeam, Waterfall, Whirlpool";
		prereqs.put("Acrobatics", 4);
		prereqs.put("Athletics", 4);
	}
	public Call_the_Current_Rank_2(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Acrobatics",4) && t.checkSkillRank("Athletics",4);
	}
}