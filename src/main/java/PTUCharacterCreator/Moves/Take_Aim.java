package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Take_Aim extends Move {
	{
		name = "Take Aim";
		effect = "Raise the user’s Accuracy by +1. If the user performs an Weapon Move on their next turn that deals damage, add its Damage Dice Roll an extra time to the damage.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "EOT";
		range = "Self";
		type = "Weapon";
		category = "Status";
	}
	public Take_Aim(){}
}