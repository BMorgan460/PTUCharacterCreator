package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Baneful_Bunker extends Move {
	{
		name = "Baneful Bunker";
		effect = "If the user is hit by an attack, the user may use Baneful Bunker. The user is instead not hit by the move. You do not take damage nor are you affected by any or the move’s effects. In addition, if the triggering attack was Melee range, the attacker is now Poisoned.";
		damageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "Self, Interrupt, Shield, Trigger";
		type = "Poison";
		category = "Status";
	}
	public Baneful_Bunker(){}
}