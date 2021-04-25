package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Vital_Throw extends Move {
	{
		name = "Vital Throw";
		effect = "If the user is targeted by a Melee attack and has not yet taken a turn this round, the user may declare Vital Throw. After the triggering attack is resolved, the user may use Vital Throw against the triggering foe as a Reaction. Vital Throw cannot miss.";
		damageBase = 7;
		mDamageBase = 7;
		AC = 0;
		frequency = "EOT";
		range = "Melee, 1 Target, Push, Reaction";
		type = "Fighting";
		category = "Physical";
	}
	public Vital_Throw(){}
}