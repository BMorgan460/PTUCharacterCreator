package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Poison_Tail extends Move {
	{
		name = "Poison Tail";
		effect = "Poison Tail is a Critical Hit on 18+ and Poisons the target on 19+.";
		damageBase = 5;
		mDamageBase = 5;
		AC = 2;
		frequency = "At-Will";
		range = "Melee, 1 Target";
		type = "Poison";
		category = "Physical";
	}
	public Poison_Tail(){}
}