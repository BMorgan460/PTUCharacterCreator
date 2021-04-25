package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Tail_Whip extends Move {
	{
		name = "Tail Whip";
		effect = "All legal targets have their Defense lowered by -1 CS.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 2;
		frequency = "At-Will";
		range = "Burst 1, Friendly";
		type = "Normal";
		category = "Status";
	}
	public Tail_Whip(){}
}