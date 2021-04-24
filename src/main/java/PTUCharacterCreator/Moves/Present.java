package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Present extends Move {
	{
		name = "Present";
		effect = "Roll 1d6, Present has a DB equal to twice the result. On a result of 1, instead of taking damage the target gains 20 HP.";
		damageBase = 0;
		AC = 3;
		frequency = "EOT";
		range = "4, 1 Target";
		type = "Normal";
		category = "Physical";
	}
	public Present(){}
}