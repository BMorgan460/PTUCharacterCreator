package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Play_Rough extends Move {
	{
		name = "Play Rough";
		effect = "Play Rough lowers the target’s Attack by -1 CS on 17+.";
		damageBase = 9;
		AC = 4;
		frequency = "EOT";
		range = "Melee, 1 Target";
		type = "Fairy";
		category = "Physical";
	}
	public Play_Rough(){}
}