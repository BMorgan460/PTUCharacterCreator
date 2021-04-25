package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Punishment extends Move {
	{
		name = "Punishment";
		effect = "Punishment's Damage Base is raised by +1 for each Combat Stage the target has, to a maximum of DB 12.";
		damageBase = 6;
		mDamageBase = 6;
		AC = 2;
		frequency = "EOT";
		range = "Melee, 1 Target";
		type = "Dark";
		category = "Physical";
	}
	public Punishment(){}
}