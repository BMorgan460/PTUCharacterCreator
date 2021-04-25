package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Encore extends Move {
	{
		name = "Encore";
		effect = "Roll 1d6. On a result of 1 or 2, the target becomes Confused, on a result of 3 or 4 the target becomes Suppressed, on a result of 5 or 6 the target becomes Enraged.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 2;
		frequency = "Scene x2";
		range = "4, 1 Target, Social";
		type = "Normal";
		category = "Status";
	}
	public Encore(){}
}