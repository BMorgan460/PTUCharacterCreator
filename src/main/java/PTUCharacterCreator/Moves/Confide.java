package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Confide extends Move {
	{
		name = "Confide";
		effect = "Lower the target's Special Attack by -1 CS.";
		damageBase = 0;
		AC = 2;
		frequency = "At-Will";
		range = "4, 1 Target, Social";
		type = "Normal";
		category = "Status";
	}
	public Confide(){}
}