package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Pluck extends Move {
	{
		name = "Pluck";
		effect = "Pluck takes the target's Held Item or Accessory Slot Item and attaches it to Pluck's user, if the user is not holding anything.";
		damageBase = 6;
		mDamageBase = 6;
		AC = 2;
		frequency = "At-Will";
		range = "Melee, 1 Target";
		type = "Flying";
		category = "Physical";
	}
	public Pluck(){}
}