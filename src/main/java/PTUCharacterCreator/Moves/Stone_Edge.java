package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Stone_Edge extends Move {
	{
		name = "Stone Edge";
		effect = "Stone Edge is a Critical Hit on 17+.";
		damageBase = 10;
		AC = 5;
		frequency = "EOT";
		range = "8, 1 Target";
		type = "Rock";
		category = "Physical";
	}
	public Stone_Edge(){}
}