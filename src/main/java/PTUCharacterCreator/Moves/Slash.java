package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Slash extends Move {
	{
		name = "Slash";
		effect = "Slash is a Critical Hit on 18+.";
		damageBase = 7;
		AC = 2;
		frequency = "EOT";
		range = "Melee, Pass";
		type = "Normal";
		category = "Physical";
	}
	public Slash(){}
}