package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Charm extends Move {
	{
		name = "Charm";
		effect = "Lower the target’s Attack by -2 CS.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 2;
		frequency = "EOT";
		range = "6, 1 Target, Social";
		type = "Fairy";
		category = "Status";
	}
	public Charm(){}
}