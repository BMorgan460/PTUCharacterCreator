package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Smog extends Move {
	{
		name = "Smog";
		effect = "Smog Poisons all legal targets on an Even-Numbered Roll.";
		damageBase = 3;
		AC = 7;
		frequency = "At-Will";
		range = "Line 2";
		type = "Poison";
		category = "Special";
	}
	public Smog(){}
}