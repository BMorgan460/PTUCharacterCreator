package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Sky_Uppercut extends Move {
	{
		name = "Sky Uppercut";
		effect = "Sky Uppercut may be used as an Interrupt when against a target initiating Bounce, Fly, or Sky Drop. If Sky Uppercut successfully hits its target, the Triggering Move fails (though the target may take their next turn normally.)";
		damageBase = 9;
		AC = 4;
		frequency = "At-Will";
		range = "Melee, 1 Target, Interrupt";
		type = "Fighting";
		category = "Physical";
	}
	public Sky_Uppercut(){}
}