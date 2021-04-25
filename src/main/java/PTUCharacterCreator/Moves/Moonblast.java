package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Moonblast extends Move {
	{
		name = "Moonblast";
		effect = "Moonblast lowers the target’s Special Attack by -1 CS on 15+.";
		damageBase = 10;
		mDamageBase = 10;
		AC = 2;
		frequency = "EOT";
		range = "6, 1 Target";
		type = "Fairy";
		category = "Special";
	}
	public Moonblast(){}
}