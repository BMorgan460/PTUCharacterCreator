package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Thief extends Move {
	{
		name = "Thief";
		effect = "Thief takes the target's held item and attaches it to Thief's user if the user is not holding anything.";
		damageBase = 6;
		mDamageBase = 6;
		AC = 2;
		frequency = "At-Will";
		range = "Melee, 1 Target";
		type = "Dark";
		category = "Physical";
	}
	public Thief(){}
}