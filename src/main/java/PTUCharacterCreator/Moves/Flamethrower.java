package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Flamethrower extends Move {
	{
		name = "Flamethrower";
		effect = "Flamethrower Burns the target on 19+.";
		damageBase = 9;
		mDamageBase = 9;
		AC = 2;
		frequency = "EOT";
		range = "4, 1 Target";
		type = "Fire";
		category = "Special";
	}
	public Flamethrower(){}
}