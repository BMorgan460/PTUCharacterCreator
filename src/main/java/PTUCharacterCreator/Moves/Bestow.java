package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Bestow extends Move {
	{
		name = "Bestow";
		effect = "The user gives its held item to the target, unless the target is already holding an item. Using Bestow is a Swift Action.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "At-Will";
		range = "Melee, 1 Target";
		type = "Normal";
		category = "Status";
	}
	public Bestow(){}
}