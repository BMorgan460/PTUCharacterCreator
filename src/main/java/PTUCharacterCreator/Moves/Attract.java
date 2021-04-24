package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Attract extends Move {
	{
		name = "Attract";
		effect = "Attract Infatuates the target if its gender is the opposite of the user’s. Attract fails when used by or against Genderless targets.";
		damageBase = 0;
		AC = 2;
		frequency = "Scene x2";
		range = "3, 1 Target, Social";
		type = "Normal";
		category = "Status";
	}
	public Attract(){}
}