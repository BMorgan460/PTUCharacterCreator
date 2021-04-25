package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Sunny_Day extends Move {
	{
		name = "Sunny Day";
		effect = "The weather becomes Sunny for 5 rounds. While Sunny, Fire-Type Attacks gain a +5 bonus to Damage Rolls, and Water-Type Attacks suffer a -5 Damage penalty.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Daily x2";
		range = "Field, Weather";
		type = "Fire";
		category = "Status";
	}
	public Sunny_Day(){}
}