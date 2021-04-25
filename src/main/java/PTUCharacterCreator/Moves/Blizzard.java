package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Blizzard extends Move {
	{
		name = "Blizzard";
		effect = "Blizzard Freezes all legal target on 15+. If the target is in Hailing Weather, Blizzard cannot miss.";
		damageBase = 11;
		mDamageBase = 11;
		AC = 7;
		frequency = "Scene x2";
		range = "4, Ranged Blast 2, Smite";
		type = "Ice";
		category = "Special";
	}
	public Blizzard(){}
}