package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Block extends Move {
	{
		name = "Block";
		effect = "The target is Stuck and Trapped until the beginning of your next turn.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 2;
		frequency = "At-Will";
		range = "Melee, 1 Target";
		type = "Normal";
		category = "Status";
	}
	public Block(){}
}