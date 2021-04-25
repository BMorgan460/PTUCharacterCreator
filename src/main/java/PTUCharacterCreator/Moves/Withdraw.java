package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Withdraw extends Move {
	{
		name = "Withdraw";
		effect = " The user becomes Withdrawn. While Withdrawn, the user becomes immune to Critical Hits and gain 15 Damage Reduction. However, while Withdrawn, the user cannot Shift, and may only use self-targeting Moves. The user may stop being Withdrawn as a Shift Action.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "At-Will";
		range = "Self";
		type = "Water";
		category = "Status";
	}
	public Withdraw(){}
}