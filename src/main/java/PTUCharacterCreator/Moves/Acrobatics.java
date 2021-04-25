package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Acrobatics extends Move {
	{
		name = "Acrobatics";
		effect = "If the user is not holding an item, Acrobatics instead has a Damage Base of 11 (3d10+10/27)";
		damageBase = 6;
		mDamageBase = 6;
		AC = 2;
		frequency = "EOT";
		range = "Melee, Dash, 1 Target";
		type = "Flying";
		category = "Physical";
	}
	public Acrobatics(){}
}