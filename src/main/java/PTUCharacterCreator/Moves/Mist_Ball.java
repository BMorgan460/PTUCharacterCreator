package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Mist_Ball extends Move {
	{
		name = "Mist Ball";
		effect = "Mist Ball lowers the target’s Special Attack by 1 Combat Stage on an Even-Numbered Roll.";
		damageBase = 7;
		AC = 2;
		frequency = "Scene x2";
		range = "12, 1 Target";
		type = "Psychic";
		category = "Special";
	}
	public Mist_Ball(){}
}