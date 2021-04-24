package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class WakeUp_Slap extends Move {
	{
		name = "Wake-Up Slap";
		effect = "If the target is Asleep, Wake-Up Slap has a Damage Base of 10 (3d8+10 / 24) instead, and cures the target of Sleep.";
		damageBase = 5;
		AC = 2;
		frequency = "At-Will";
		range = "Melee, 1 Target";
		type = "Fighting";
		category = "Physical";
	}
	public WakeUp_Slap(){}
}