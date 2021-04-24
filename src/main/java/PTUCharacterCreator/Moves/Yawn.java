package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Yawn extends Move {
	{
		name = "Yawn";
		effect = "The target falls Asleep at the end of its next turn. Yawn cannot miss.";
		damageBase = 0;
		AC = 0;
		frequency = "Scene x2";
		range = "2, 1 Target, Social";
		type = "Normal";
		category = "Status";
	}
	public Yawn(){}
}