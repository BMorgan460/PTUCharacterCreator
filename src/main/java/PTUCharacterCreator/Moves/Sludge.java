package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Sludge extends Move {
	{
		name = "Sludge";
		effect = "Sludge Poisons the target on 15+.";
		damageBase = 7;
		mDamageBase = 7;
		AC = 2;
		frequency = "EOT";
		range = "6, 1 Target";
		type = "Poison";
		category = "Special";
	}
	public Sludge(){}
}