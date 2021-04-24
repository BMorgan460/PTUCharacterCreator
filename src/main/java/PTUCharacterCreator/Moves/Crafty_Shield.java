package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Crafty_Shield extends Move {
	{
		name = "Crafty Shield";
		effect = "If the user or an Ally within 2 meters of Crafty Shield's user is hit by a Status Move, you may use Crafty Shield as an Interrupt. All targets in Crafty Shield's area-of-effect including the user, are instead not hit by the triggering Move and do not suffer any of its effects.";
		damageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "Burst 2, Trigger, Interrupt, Shield";
		type = "Fairy";
		category = "Status";
	}
	public Crafty_Shield(){}
}