package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Screech extends Move {
	{
		name = "Screech";
		effect = "Lower the Defense of all legal targets by -2 CS.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 4;
		frequency = "EOT";
		range = "Burst 2, Friendly, Sonic";
		type = "Normal";
		category = "Status";
	}
	public Screech(){}
}