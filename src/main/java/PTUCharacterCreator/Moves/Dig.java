package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Dig extends Move {
	{
		name = "Dig";
		effect = "Set-Up Effect: The user shifts 25 meters underground and their turn ends. Resolution Effect: The user may shift horizontally using their burrow or overland speed, and then shifts 25 meters straight up. Upon reaching the surface, the user attacks with Dig, creating a Burst 1. *Grants: Burrow +3";
		damageBase = 8;
		mDamageBase = 8;
		AC = 2;
		frequency = "EOT";
		range = "Burst 1, Set-Up, Full Action, Groundsource";
		type = "Ground";
		category = "Physical";
	}
	public Dig(){}
}