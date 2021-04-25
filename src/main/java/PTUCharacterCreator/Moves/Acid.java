package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Acid extends Move {
	{
		name = "Acid";
		effect = "Acid lowers the target’s Defense by -1 Combat Stage on 18+.";
		damageBase = 4;
		mDamageBase = 4;
		AC = 2;
		frequency = "At-Will";
		range = "Cone 2";
		type = "Poison";
		category = "Special";
	}
	public Acid(){}
}