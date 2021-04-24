package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Spark extends Move {
	{
		name = "Spark";
		effect = "Spark Paralyzes the target on 15+.";
		damageBase = 6;
		AC = 2;
		frequency = "EOT";
		range = "Melee, 1 Target, Dash";
		type = "Electric";
		category = "Physical";
	}
	public Spark(){}
}