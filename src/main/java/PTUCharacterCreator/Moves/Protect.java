package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Protect extends Move {
	{
		name = "Protect";
		effect = "If the user is hit by a Move, the user may use Protect. The user is instead not hit by the Move. The user does not take any damage nor is affected by any of the Move's effects.";
		damageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "Self, Interrupt, Shield, Trigger";
		type = "Normal";
		category = "Status";
	}
	public Protect(){}
}