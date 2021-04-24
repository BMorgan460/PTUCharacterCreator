package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Call_the_Current_Rank_3 extends Feature {
	{
		name = "Call the Current Rank 3";
		tags = "[Ranked 3] [+Speed]";
		frequency = "Static";
		effect = "You learn 2 Moves chosen from the list below, marked with the Rank of this Feature you are gaining or lower. Rank 3 Moves: Aqua Tail, Rain Dance, Surf";
		prereqs.put("Acrobatics", 5);
		prereqs.put("Athletics", 5);
	}
	public Call_the_Current_Rank_3(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Acrobatics",5) && t.checkSkillRank("Athletics",5);
	}
}