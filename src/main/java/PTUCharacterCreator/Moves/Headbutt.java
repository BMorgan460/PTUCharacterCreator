package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Headbutt extends Move {
	{
		name = "Headbutt";
		effect = "Headbutt Flinches the target on 15+.";
		damageBase = 7;
		AC = 2;
		frequency = "EOT";
		range = "Melee, 1 Target";
		type = "Normal";
		category = "Physical";
	}
	public Headbutt(){}
}