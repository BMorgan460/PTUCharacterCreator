package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Attack_Order extends Move {
	{
		name = "Attack Order";
		effect = "Attack Order is a Critical Hit on 18+.";
		damageBase = 9;
		AC = 2;
		frequency = "EOT";
		range = "6, 1 Target";
		type = "Bug";
		category = "Physical";
	}
	public Attack_Order(){}
}