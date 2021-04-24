package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Lunge extends Move {
	{
		name = "Lunge";
		effect = "Lunge lowers the targets Attack 1 Combat Stage on 15+.";
		damageBase = 8;
		AC = 2;
		frequency = "EOT";
		range = "Melee, 1 Target, Dash";
		type = "Bug";
		category = "Physical";
	}
	public Lunge(){}
}