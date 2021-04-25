package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Embargo extends Move {
	{
		name = "Embargo";
		effect = "The target cannot use or benefit from held items for the remainder of the encounter. Embargo may only affect one target at a time, if Embargo is used on a new target, the previous target is freed from the effect.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 2;
		frequency = "At-Will";
		range = "6, 1 Target";
		type = "Dark";
		category = "Status";
	}
	public Embargo(){}
}