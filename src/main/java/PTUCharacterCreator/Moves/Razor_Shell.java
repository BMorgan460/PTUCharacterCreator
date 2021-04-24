package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Razor_Shell extends Move {
	{
		name = "Razor Shell";
		effect = "Razor Shell lowers the target's Defense by -1 CS on an Even-Numbered Roll.";
		damageBase = 8;
		AC = 3;
		frequency = "EOT";
		range = "Melee, 1 Target, Dash";
		type = "Water";
		category = "Physical";
	}
	public Razor_Shell(){}
}