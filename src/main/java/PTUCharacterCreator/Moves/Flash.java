package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Flash extends Move {
	{
		name = "Flash";
		effect = "Lower the Accuracy of all legal targets by -1. *Grants Glow";
		damageBase = 0;
		mDamageBase = 0;
		AC = 2;
		frequency = "EOT";
		range = "Cone 2";
		type = "Normal";
		category = "Status";
	}
	public Flash(){}
}