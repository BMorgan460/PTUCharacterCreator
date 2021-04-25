package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Belch extends Move {
	{
		name = "Belch";
		effect = "Belch cannot be used if the user has not traded in a Digestion/Food Buff during this Scene.";
		damageBase = 12;
		mDamageBase = 12;
		AC = 4;
		frequency = "Scene x2";
		range = "Cone 2";
		type = "Poison";
		category = "Special";
	}
	public Belch(){}
}