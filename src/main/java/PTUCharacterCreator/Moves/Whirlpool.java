package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Whirlpool extends Move {
	{
		name = "Whirlpool";
		effect = "The target is put in a Vortex.";
		damageBase = 4;
		AC = 4;
		frequency = "Scene x2";
		range = "3, 1 Target";
		type = "Water";
		category = "Special";
	}
	public Whirlpool(){}
}