package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Liquidation extends Move {
	{
		name = "Liquidation";
		effect = "The target is pushed 1 meter. Liquidation lowers the targets Defense 1 Combat Stage on 17+";
		damageBase = 9;
		mDamageBase = 9;
		AC = 2;
		frequency = "EOT";
		range = "Melee, 1 Target, Dash, Push";
		type = "Water";
		category = "Physical";
	}
	public Liquidation(){}
}