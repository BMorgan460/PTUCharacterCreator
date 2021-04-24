package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Hex_Maniac_Studies_Rank_1 extends Feature {
	{
		name = "Hex Maniac Studies Rank 1";
		tags = "[+HP][Ranked 3]";
		frequency = "Static";
		effect = "Learn two Hex Maniac Moves. You may choose any Move marked with the Hex Maniac Studies Rank you are taking or lower.  Use Curse as if you were a Ghost-type Pokemon. Rank 1 Moves: Confuse Ray, Curse, Hypnosis, Spite, Will-O-Wisp";
		prereqs.put("Hex Maniac", -1);
	}
	public Hex_Maniac_Studies_Rank_1(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Hex Maniac");
	}
}