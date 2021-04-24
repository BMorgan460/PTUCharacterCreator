package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Hex_Maniac_Studies_Rank_2 extends Feature {
	{
		name = "Hex Maniac Studies Rank 2";
		tags = "[+HP][Ranked 3]";
		frequency = "Static";
		effect = "Learn two Hex Maniac Moves. You may choose any Move marked with the Hex Maniac Studies Rank you are taking or lower.";
		prereqs.put("Hex Maniac", -1);
	}
	public Hex_Maniac_Studies_Rank_2(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Hex Maniac");
	}
}