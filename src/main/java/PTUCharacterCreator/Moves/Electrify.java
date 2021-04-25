package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Electrify extends Move {
	{
		name = "Electrify";
		effect = "Until the end of the user's next turn, the target's damaging Water-Type attacks and Melee attacks of any Type deal Electric-Type Damage instead of their usual Type.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "EOT";
		range = "6, 1 Target.";
		type = "Electric";
		category = "Status";
	}
	public Electrify(){}
}