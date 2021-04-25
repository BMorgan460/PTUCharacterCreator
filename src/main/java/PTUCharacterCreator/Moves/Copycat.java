package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Copycat extends Move {
	{
		name = "Copycat";
		effect = "Use the Move the target has used on their last turn. You may choose new targets for the Move. Copycat cannot miss.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Scene x2";
		range = "4, 1 Target";
		type = "Normal";
		category = "Status";
	}
	public Copycat(){}
}