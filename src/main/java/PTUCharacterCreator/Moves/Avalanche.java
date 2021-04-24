package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Avalanche extends Move {
	{
		name = "Avalanche";
		effect = "When declaring Avalanche, the user does nothing and may not Shift. At the end of the round, the user may Shift and use Avalanche. If the target damaged the user this round, Avalanche has a Damage Base of 12 (4d10+15 / 40).";
		damageBase = 6;
		AC = 2;
		frequency = "EOT";
		range = "Melee, 1 Target";
		type = "Ice";
		category = "Physical";
	}
	public Avalanche(){}
}