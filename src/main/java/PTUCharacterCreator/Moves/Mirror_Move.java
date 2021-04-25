package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Mirror_Move extends Move {
	{
		name = "Mirror Move";
		effect = "Use the Move the target has used on their last turn. You may choose new targets for the Move. Mirror Move cannot miss.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Scene x2";
		range = "6, 1 Target, Illusion";
		type = "Flying";
		category = "Status";
	}
	public Mirror_Move(){}
}