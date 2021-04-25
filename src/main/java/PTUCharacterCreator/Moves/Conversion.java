package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Conversion extends Move {
	{
		name = "Conversion";
		effect = "The user becomes the elemental Type of their choice as long as they have a Move that is the same elemental Type until the end of the encounter. Replace all other Types.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "At-Will";
		range = "Self";
		type = "Normal";
		category = "Status";
	}
	public Conversion(){}
}