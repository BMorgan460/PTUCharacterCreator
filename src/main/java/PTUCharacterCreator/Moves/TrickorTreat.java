package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class TrickorTreat extends Move {
	{
		name = "Trick-or-Treat";
		effect = "The target gains the Ghost Type in addition to its other Types for 5 turns.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 2;
		frequency = "Daily";
		range = "6, 1 Target";
		type = "Ghost";
		category = "Status";
	}
	public TrickorTreat(){}
}