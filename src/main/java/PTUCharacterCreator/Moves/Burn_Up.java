package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Burn_Up extends Move {
	{
		name = "Burn Up";
		effect = "After using Burn Up, the user loses its Fire-type. If this would leave it without a type, the user becomes ???-type, and takes neutral damage from all types.";
		damageBase = 13;
		mDamageBase = 13;
		AC = 4;
		frequency = "Daily";
		range = "Cone 2";
		type = "Fire";
		category = "Special";
	}
	public Burn_Up(){}
}