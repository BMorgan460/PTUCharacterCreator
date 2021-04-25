package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Electroweb extends Move {
	{
		name = "Electroweb";
		effect = "Lower the Speed of all legal targets by -1 CS.";
		damageBase = 6;
		mDamageBase = 6;
		AC = 3;
		frequency = "EOT";
		range = "4, Ranged Blast 2";
		type = "Electric";
		category = "Special";
	}
	public Electroweb(){}
}