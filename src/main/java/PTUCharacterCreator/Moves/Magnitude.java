package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Magnitude extends Move {
	{
		name = "Magnitude";
		effect = "When you use Magnitude, roll 1d6. Magnitude’s Damage Base is equal to 5+X, where X is the value of the d6. Magnitude can hit targets that are underground, including those using the Move Dig. *Grants: Groundshaper";
		damageBase = 6;
		mDamageBase = 6;
		AC = 2;
		frequency = "EOT";
		range = "Burst 2, Groundsource";
		type = "Ground";
		category = "Physical";
	}
	public Magnitude(){}
}