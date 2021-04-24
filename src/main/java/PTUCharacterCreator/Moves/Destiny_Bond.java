package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Destiny_Bond extends Move {
	{
		name = "Destiny Bond";
		effect = "All enemy targets in the burst become Bound to the user until the end of your next turn. If a Bound target causes the user to Faint through a Damaging Attack, the Bound target immediately faints after their attack is resolved.";
		damageBase = 0;
		AC = 0;
		frequency = "EOT";
		range = "Burst 10, Friendly";
		type = "Ghost";
		category = "Status";
	}
	public Destiny_Bond(){}
}