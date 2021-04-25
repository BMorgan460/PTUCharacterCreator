package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Eruption extends Move {
	{
		name = "Eruption";
		effect = "For each 10% of HP the user is missing, Eruption's Damage Base is reduced by 1. Eruption creates a 1 meter burst, but also affects an area 10 meters tall straight up.";
		damageBase = 15;
		mDamageBase = 15;
		AC = 4;
		frequency = "Daily";
		range = "Burst 1*";
		type = "Fire";
		category = "Special";
	}
	public Eruption(){}
}