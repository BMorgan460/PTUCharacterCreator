package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Psycho_Boost extends Move {
	{
		name = "Psycho Boost";
		effect = "Lower the user's Special Attack by -2 Combat Stages after damage is resolved.";
		damageBase = 14;
		mDamageBase = 14;
		AC = 4;
		frequency = "Scene";
		range = "8, Ranged Blast 3, Smite";
		type = "Psychic";
		category = "Special";
	}
	public Psycho_Boost(){}
}