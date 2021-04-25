package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Imprison extends Move {
	{
		name = "Imprison";
		effect = "The target is Locked for the rest of the Scene. A Locked target may not use any Moves the user knows. Imprison cannot miss.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Scene x2";
		range = "10, 1 Target";
		type = "Psychic";
		category = "Status";
	}
	public Imprison(){}
}