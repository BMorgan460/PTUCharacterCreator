package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Poison_Powder extends Move {
	{
		name = "Poison Powder";
		effect = "The target is Poisoned.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 6;
		frequency = "EOT";
		range = "4, 1 Target, Powder";
		type = "Poison";
		category = "Status";
	}
	public Poison_Powder(){}
}