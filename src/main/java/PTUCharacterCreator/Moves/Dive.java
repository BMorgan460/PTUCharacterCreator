package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Dive extends Move {
	{
		name = "Dive";
		effect = "Set-Up Effect: The user moves underwater and its turn ends. The user must be in water at least 10 meters deep to use Dive. While underwater, the user may not be targeted by Moves. Resolution Effect: The user may shift horizontally using their underwater speed, and then may shift straight up until reaching a target. The user then attacks with Dive, creating a Burst 1. *Grants Swim +3";
		damageBase = 8;
		AC = 2;
		frequency = "Scene x2";
		range = "Burst 1, Set Up, Full Action";
		type = "Water";
		category = "Physical";
	}
	public Dive(){}
}