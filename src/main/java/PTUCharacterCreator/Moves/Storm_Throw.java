package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Storm_Throw extends Move {
	{
		name = "Storm Throw";
		effect = "If Storm Throw hits, it is a Critical Hit.";
		damageBase = 6;
		AC = 2;
		frequency = "EOT";
		range = "Melee, 1 Target";
		type = "Fighting";
		category = "Physical";
	}
	public Storm_Throw(){}
}