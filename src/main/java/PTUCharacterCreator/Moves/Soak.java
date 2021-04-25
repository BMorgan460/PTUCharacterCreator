package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Soak extends Move {
	{
		name = "Soak";
		effect = "The target gains the Water type in addition to its other Types for 5 turns.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 2;
		frequency = "Daily";
		range = "5, 1 Target";
		type = "Water";
		category = "Status";
	}
	public Soak(){}
}