package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Venoshock extends Move {
	{
		name = "Venoshock";
		effect = "If the target is Poisoned, Venoshock has a Damage Base of 13 (4d10+10 / 35) instead.";
		damageBase = 7;
		mDamageBase = 7;
		AC = 2;
		frequency = "Scene x2";
		range = "6, 1 Target";
		type = "Poison";
		category = "Special";
	}
	public Venoshock(){}
}