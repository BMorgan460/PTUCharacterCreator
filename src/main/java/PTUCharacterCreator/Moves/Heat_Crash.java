package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Heat_Crash extends Move {
	{
		name = "Heat Crash";
		effect = "For each weight class the user is above the target, increase Heavy Crash's damage base by +2.";
		damageBase = 4;
		mDamageBase = 4;
		AC = 2;
		frequency = "EOT";
		range = "Melee, 1 Target, Dash";
		type = "Fire";
		category = "Physical";
	}
	public Heat_Crash(){}
}