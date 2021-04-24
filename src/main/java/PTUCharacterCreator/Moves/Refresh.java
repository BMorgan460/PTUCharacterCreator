package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Refresh extends Move {
	{
		name = "Refresh";
		effect = "The user is cured of all Poison, Burns, and Paralysis.";
		damageBase = 0;
		AC = 0;
		frequency = "Scene x2";
		range = "Self";
		type = "Normal";
		category = "Status";
	}
	public Refresh(){}
}