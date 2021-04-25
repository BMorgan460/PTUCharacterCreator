package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Dynamic_Punch extends Move {
	{
		name = "Dynamic Punch";
		effect = "Dynamic Punch Confuses the target. Dynamic Punch ignores the target's Evasion if they are Flanked.";
		damageBase = 10;
		mDamageBase = 10;
		AC = 9;
		frequency = "At-Will";
		range = "Melee, 1 Target";
		type = "Fighting";
		category = "Physical";
	}
	public Dynamic_Punch(){}
}