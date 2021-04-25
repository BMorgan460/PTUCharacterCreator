package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Spite extends Move {
	{
		name = "Spite";
		effect = "Spite may be used as a Free Action that does not take up a Command whenever the user is hit by a Move. That Move becomes Disabled for the attacker.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "1 Target, Trigger";
		type = "Ghost";
		category = "Status";
	}
	public Spite(){}
}