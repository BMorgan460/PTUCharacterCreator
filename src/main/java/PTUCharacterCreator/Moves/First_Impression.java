package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class First_Impression extends Move {
	{
		name = "First Impression";
		effect = "You may only use First Impression with Priority upon joining an encounter. Switching out resets the requirements of joining the encounter.";
		damageBase = 9;
		mDamageBase = 9;
		AC = 2;
		frequency = "At-Will";
		range = "Melee, 1 Target, Priority";
		type = "Bug";
		category = "Physical";
	}
	public First_Impression(){}
}