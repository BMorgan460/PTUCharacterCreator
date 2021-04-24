package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Core_Enforcer extends Move {
	{
		name = "Core Enforcer";
		effect = "Core Enforcer disables the abilities of any targets hit that have already acted this round. If they are hit by Smite damage, the targets abilities are not disabled.";
		damageBase = 10;
		AC = 4;
		frequency = "Daily";
		range = "6, Ranged Blast 3, Smite";
		type = "Dragon";
		category = "Special";
	}
	public Core_Enforcer(){}
}