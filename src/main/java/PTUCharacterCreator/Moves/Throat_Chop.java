package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Throat_Chop extends Move {
	{
		name = "Throat Chop";
		effect = "The target cannot use moves with the Sonic keyword for 2 rounds.";
		damageBase = 8;
		mDamageBase = 8;
		AC = 2;
		frequency = "Scene x2";
		range = "Melee, 1 Target";
		type = "Dark";
		category = "Physical";
	}
	public Throat_Chop(){}
}