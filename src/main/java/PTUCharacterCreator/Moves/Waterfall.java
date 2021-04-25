package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Waterfall extends Move {
	{
		name = "Waterfall";
		effect = "Waterfall Flinches the target on 17+.";
		damageBase = 8;
		mDamageBase = 8;
		AC = 2;
		frequency = "EOT";
		range = "Melee, 1 Target";
		type = "Water";
		category = "Physical";
	}
	public Waterfall(){}
}