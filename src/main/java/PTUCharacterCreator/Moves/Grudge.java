package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Grudge extends Move {
	{
		name = "Grudge";
		effect = "You may use Grudge as an Interrupt when a Damaging Attack causes the user to faint. Grudge is activated as a Free Action (does not take up a Command.) The attack is resolved as usual, and the user Faints. The attacker that caused the user to Faint becomes Suppressed for the remainder of the encounter, switching and Taking a Breather does not end Suppression when used this way.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Daily";
		range = "6, 1 Target, Interrupt";
		type = "Ghost";
		category = "Status";
	}
	public Grudge(){}
}