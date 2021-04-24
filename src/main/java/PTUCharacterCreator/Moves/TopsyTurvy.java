package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class TopsyTurvy extends Move {
	{
		name = "Topsy-Turvy";
		effect = "The target’s Combat Stages are inverted, +1 Stage becomes -1 Stage, -3 Stages becomes +3 Stages, etc.";
		damageBase = 0;
		AC = 4;
		frequency = "EOT";
		range = "6, 1 Target";
		type = "Dark";
		category = "Status";
	}
	public TopsyTurvy(){}
}