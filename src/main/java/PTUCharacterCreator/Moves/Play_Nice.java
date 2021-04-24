package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Play_Nice extends Move {
	{
		name = "Play Nice";
		effect = "Play Nice lowers the target’s Attack by -1 CS.";
		damageBase = 0;
		AC = 2;
		frequency = "At-Will";
		range = "6, 1 Target, Social";
		type = "Normal";
		category = "Status";
	}
	public Play_Nice(){}
}