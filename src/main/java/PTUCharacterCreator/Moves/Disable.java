package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Disable extends Move {
	{
		name = "Disable";
		effect = "Disable may be used as a Free Action that does not take up a Command whenever the user is hit by a Move. That Move becomes Disabled for the attacker.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "1 Target, Trigger";
		type = "Normal";
		category = "Status";
	}
	public Disable(){}
}