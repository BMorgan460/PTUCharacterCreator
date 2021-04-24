package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Tickle extends Move {
	{
		name = "Tickle";
		effect = "Lower the target’s Attack and Defense by -1 CS each.";
		damageBase = 0;
		AC = 2;
		frequency = "EOT";
		range = "Melee, 1 Target";
		type = "Normal";
		category = "Status";
	}
	public Tickle(){}
}