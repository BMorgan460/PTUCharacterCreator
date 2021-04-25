package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Helping_Hand extends Move {
	{
		name = "Helping Hand";
		effect = "Helping Hand grants the target +2 on its next Accuracy Roll this round, and +10 to its next Damage Roll this round.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "EOT";
		range = "4, 1 Target, Priority";
		type = "Normal";
		category = "Status";
	}
	public Helping_Hand(){}
}