package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Snarl extends Move {
	{
		name = "Snarl";
		effect = "Lower the Special Attack of all legal targets by -1 CS.";
		damageBase = 6;
		mDamageBase = 6;
		AC = 3;
		frequency = "EOT";
		range = "Cone 2, Sonic";
		type = "Dark";
		category = "Special";
	}
	public Snarl(){}
}