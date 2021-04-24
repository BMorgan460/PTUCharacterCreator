package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Sucker_Punch extends Move {
	{
		name = "Sucker Punch";
		effect = "If an adjacent foe targets the user with a Damaging Attack, Sucker Punch may be used as an Interrupt Move against the triggering foe.";
		damageBase = 8;
		AC = 2;
		frequency = "At-Will";
		range = "Melee, 1 Target, Trigger, Interrupt";
		type = "Dark";
		category = "Physical";
	}
	public Sucker_Punch(){}
}