package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Swagger extends Move {
	{
		name = "Swagger";
		effect = "Raise the target's Attack by +2 CS. The target is Confused.";
		damageBase = 0;
		AC = 4;
		frequency = "EOT";
		range = "6, 1 Target, Social";
		type = "Normal";
		category = "Status";
	}
	public Swagger(){}
}