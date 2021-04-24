package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Mystical_Fire extends Move {
	{
		name = "Mystical Fire";
		effect = "Mystical Fire lowers the target’s Special Attack by 1 Combat Stage.";
		damageBase = 7;
		AC = 2;
		frequency = "EOT";
		range = "6, 1 Target";
		type = "Fire";
		category = "Special";
	}
	public Mystical_Fire(){}
}