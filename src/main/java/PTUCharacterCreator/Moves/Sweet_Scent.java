package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Sweet_Scent extends Move {
	{
		name = "Sweet Scent";
		effect = "Targets hit by Sweet Scent gain a -2 Penalty to Evasion. (Total Evasion may not be lowered to a negative value.) *Grants Alluring";
		damageBase = 0;
		mDamageBase = 0;
		AC = 2;
		frequency = "Scene";
		range = "Burst 2, Friendly";
		type = "Normal";
		category = "Status";
	}
	public Sweet_Scent(){}
}