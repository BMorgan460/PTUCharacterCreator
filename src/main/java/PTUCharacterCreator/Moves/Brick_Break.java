package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Brick_Break extends Move {
	{
		name = "Brick Break";
		effect = " Light Screen and Reflect may not be activated in response to Brick Break.";
		damageBase = 8;
		AC = 2;
		frequency = "At-Will";
		range = "Melee, 1 Target";
		type = "Fighting";
		category = "Physical";
	}
	public Brick_Break(){}
}