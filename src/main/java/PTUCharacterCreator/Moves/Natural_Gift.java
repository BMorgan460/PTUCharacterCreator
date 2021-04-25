package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Natural_Gift extends Move {
	{
		name = "Natural Gift";
		effect = "Refer to the Move Keywords Berry list. Natural Gift deals damage according to the Berry list and Natural Gift’s Type is also defined there. The Berry’s Digestion/Food Buff is nullified and is not used.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 2;
		frequency = "Scene";
		range = "6, 1 Target, Berry";
		type = "Normal";
		category = "Special";
	}
	public Natural_Gift(){}
}