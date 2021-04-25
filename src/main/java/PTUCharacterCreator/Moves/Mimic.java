package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Mimic extends Move {
	{
		name = "Mimic";
		effect = "Choose a Move that the target has used during the encounter. For the remainder of the encounter, that Move replaces Mimic on the user’s Move List. Mimic cannot miss.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "6, 1 Target";
		type = "Normal";
		category = "Status";
	}
	public Mimic(){}
}