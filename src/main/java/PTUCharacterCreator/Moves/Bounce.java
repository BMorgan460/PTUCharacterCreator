package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Bounce extends Move {
	{
		name = "Bounce";
		effect = "The user first Shifts, gaining a +1 Bonus to Movement Speed and to their Jump Capabilities. After the user Shifts, they may attack with Bounce. The target becomes Vulnerable, and is Paralyzed on 16+. Grants High Jump +1";
		damageBase = 9;
		mDamageBase = 9;
		AC = 4;
		frequency = "Scene x2";
		range = "Melee, 1 Target, Dash, Full Action";
		type = "Flying";
		category = "Physical";
	}
	public Bounce(){}
}