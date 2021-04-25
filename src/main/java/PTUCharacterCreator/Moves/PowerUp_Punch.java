package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class PowerUp_Punch extends Move {
	{
		name = "Power-Up Punch";
		effect = "If Power-Up Punch successfully hits a target, the user's Attack is raised by +1 Combat Stage";
		damageBase = 4;
		mDamageBase = 4;
		AC = 2;
		frequency = "EOT";
		range = "Melee, 1 Target";
		type = "Fighting";
		category = "Physical";
	}
	public PowerUp_Punch(){}
}