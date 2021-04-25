package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Power_Trip extends Move {
	{
		name = "Power Trip";
		effect = "For every Combat Stage the user has above 0, add +2 to Power Trip’s Damage Base, up to a maximum Damage Base of 20.";
		damageBase = 2;
		mDamageBase = 2;
		AC = 2;
		frequency = "EOT";
		range = "Melee, 1 Target";
		type = "Dark";
		category = "Physical";
	}
	public Power_Trip(){}
}