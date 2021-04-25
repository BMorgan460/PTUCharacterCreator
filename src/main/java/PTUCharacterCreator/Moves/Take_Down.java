package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Take_Down extends Move {
	{
		name = "Take Down";
		effect = "You may perform a Trip Maneuver against the target as a Free Action.";
		damageBase = 9;
		mDamageBase = 9;
		AC = 5;
		frequency = "EOT";
		range = "Melee, 1 Target, Dash, Recoil 1/3";
		type = "Normal";
		category = "Physical";
	}
	public Take_Down(){}
}