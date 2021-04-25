package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Confuse_Ray extends Move {
	{
		name = "Confuse Ray";
		effect = "The target is Confused.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 2;
		frequency = "Scene x2";
		range = "6, 1 Target";
		type = "Ghost";
		category = "Status";
	}
	public Confuse_Ray(){}
}