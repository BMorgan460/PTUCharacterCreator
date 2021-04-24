package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Hex_Maniac_Studies_Rank_3 extends Feature {
	{
		name = "Hex Maniac Studies Rank 3";
		tags = "[+HP][Ranked 3]";
		frequency = "Static";
		effect = "Learn two Hex Maniac Moves. You may choose any Move marked with the Hex Maniac Studies Rank you are taking or lower. Rank 3 Move: Hex";
		prereqs.put("Hex Maniac", -1);
		prereqs.put("Ocu Edu", 5);
	}
	public Hex_Maniac_Studies_Rank_3(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Hex Maniac") && t.checkSkillRank("Ocu Edu",5);
	}
}