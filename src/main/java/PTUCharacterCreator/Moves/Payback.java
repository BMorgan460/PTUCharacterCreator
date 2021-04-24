package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Payback extends Move {
	{
		name = "Payback";
		effect = "If the target hit the user with a Damaging Move on the previous turn, Payback has a Damage Base of 10 (3d8+10 / 24) instead.";
		damageBase = 5;
		AC = 2;
		frequency = "EOT";
		range = "Melee, 1 Target";
		type = "Dark";
		category = "Physical";
	}
	public Payback(){}
}