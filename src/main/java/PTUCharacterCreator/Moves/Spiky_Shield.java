package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Spiky_Shield extends Move {
	{
		name = "Spiky Shield";
		effect = "If the user is hit by an attack, the user may use Spiky Shield. The user is instead not hit by the Move. You do not take any damage nor are you affected by any of the Move’s effects. In addition, if the triggering attack was Melee-ranged, the attacker loses Hit Points equal to 1/10th of their Max Hit Points.";
		damageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "Self, Interrupt, Shield, Trigger";
		type = "Grass";
		category = "Status";
	}
	public Spiky_Shield(){}
}