package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Revenge extends Move {
	{
		name = "Revenge";
		effect = "When declaring Revenge, the user does nothing and may not Shift. At the end of the round, the user may Shift and use Revenge. If the target damaged the user this round, Revenge has a Damage Base of 12 (4d10+15 / 40).";
		damageBase = 6;
		mDamageBase = 6;
		AC = 2;
		frequency = "EOT";
		range = "Melee, 1 Target";
		type = "Fighting";
		category = "Physical";
	}
	public Revenge(){}
}