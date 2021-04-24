package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Bug_Buzz extends Move {
	{
		name = "Bug Buzz";
		effect = "Bug Buzz lowers the Special Defense of all legal targets by -1 CS on 19+.";
		damageBase = 9;
		AC = 2;
		frequency = "Scene x2";
		range = "Cone 2 or Close Blast 2, Sonic, Smite";
		type = "Bug";
		category = "Special";
	}
	public Bug_Buzz(){}
}