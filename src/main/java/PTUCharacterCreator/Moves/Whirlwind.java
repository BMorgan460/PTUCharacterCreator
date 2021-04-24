package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Whirlwind extends Move {
	{
		name = "Whirlwind";
		effect = "All targets are pushed X meters, where X is 8 minus their weight class. If the Line targets into a Smokescreen, the smoke is dispersed. All hazards in the Whirlwind are destroyed.";
		damageBase = 0;
		AC = 2;
		frequency = "Scene x2";
		range = "Line 6";
		type = "Normal";
		category = "Status";
	}
	public Whirlwind(){}
}