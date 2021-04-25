package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Purify extends Move {
	{
		name = "Purify";
		effect = "The target is cured of a Volatile Status Ailment. The user regains 25% of their max Hit Points.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Scene x2";
		range = "4, 1 Target";
		type = "Poison";
		category = "Status";
	}
	public Purify(){}
}