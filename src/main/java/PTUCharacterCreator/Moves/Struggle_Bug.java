package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Struggle_Bug extends Move {
	{
		name = "Struggle Bug";
		effect = "Lower the Special Attack of all legal targets by -1 CS.";
		damageBase = 5;
		mDamageBase = 5;
		AC = 2;
		frequency = "At-Will";
		range = "Cone 2";
		type = "Bug";
		category = "Special";
	}
	public Struggle_Bug(){}
}