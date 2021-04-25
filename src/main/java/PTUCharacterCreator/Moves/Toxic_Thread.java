package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Toxic_Thread extends Move {
	{
		name = "Toxic Thread";
		effect = "The targets Speed is lowered 1 Combat Stage and poisoned.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 5;
		frequency = "EOT";
		range = "6, 1 Target";
		type = "Poison";
		category = "Status";
	}
	public Toxic_Thread(){}
}