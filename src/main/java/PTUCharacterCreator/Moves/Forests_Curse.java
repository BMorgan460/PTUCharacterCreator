package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Forests_Curse extends Move {
	{
		name = "Forest's Curse";
		effect = "The target gains the Grass Type in addition to its other Types for 5 turns.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 2;
		frequency = "Daily";
		range = "6, 1 Target";
		type = "Grass";
		category = "Status";
	}
	public Forests_Curse(){}
}