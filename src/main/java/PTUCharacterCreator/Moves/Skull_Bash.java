package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Skull_Bash extends Move {
	{
		name = "Skull Bash";
		effect = "Set-Up Effect: Raise the user's Defense by +1 CS. Resolution Effect: The user may attack with Skull Bash. The target is pushed 3 meters.";
		damageBase = 13;
		AC = 2;
		frequency = "Scene x2";
		range = "Melee, 1 Target, Dash, Push, Set-Up";
		type = "Normal";
		category = "Physical";
	}
	public Skull_Bash(){}
}