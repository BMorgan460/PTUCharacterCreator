package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Power_Up_Punch extends Move{
		{
		name = "Power-Up Punch";
		type = "Fighting";
		frequency = "EOT";
		AC = 2;
		damageBase = 4;
		mDamageBase = 4;
		category = "Physical";
		range = "Melee, 1 Target";
		effect = "If Power-Up Punch successfully hits a target, the user’s Attack is raised by +1 Combat Stage";
		}
                public Power_Up_Punch(){}
}