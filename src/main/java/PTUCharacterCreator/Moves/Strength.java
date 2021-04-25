package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Strength extends Move {
	{
		name = "Strength";
		effect = "You may immediately initiate a Push Maneuver as a Free Action. The Maneuver automatically hits, but you must still make the Opposed Roll. *Grants +1 Power";
		damageBase = 8;
		mDamageBase = 8;
		AC = 2;
		frequency = "EOT";
		range = "Melee, 1 Target, Push";
		type = "Normal";
		category = "Physical";
	}
	public Strength(){}
}