package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Defend_Order extends Move {
	{
		name = "Defend Order";
		effect = "Raise the user's Defense and Special Defense by +1 CS each.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "EOT";
		range = "Self";
		type = "Bug";
		category = "Status";
	}
	public Defend_Order(){}
}