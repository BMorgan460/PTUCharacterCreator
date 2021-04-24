package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Sonic_Boom extends Move {
	{
		name = "Sonic Boom";
		effect = "Sonicboom causes the target to lose 15 HP. Sonicboom is Special and interacts with other moves and effects as such (Special Evasion may be applied to avoid it, Mirror Coat can reflect it, etc.)";
		damageBase = 0;
		AC = 6;
		frequency = "EOT";
		range = "8, 1 Target";
		type = "Normal";
		category = "Special";
	}
	public Sonic_Boom(){}
}