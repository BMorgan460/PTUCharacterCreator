package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Bash extends Move {
	{
		name = "Bash!";
		effect = "Bash! lowers the target’s Initiative to 0 for 1 full round on 15+.";
		damageBase = 7;
		mDamageBase = 7;
		AC = 2;
		frequency = "EOT";
		range = "WR, 1 Target";
		type = "Weapon";
		category = "Physical";
	}
	public Bash(){}
}