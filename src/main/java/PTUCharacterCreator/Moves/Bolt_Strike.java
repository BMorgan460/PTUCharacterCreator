package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Bolt_Strike extends Move {
	{
		name = "Bolt Strike";
		effect = "Bolt Strike Paralyzes the target on 17+.";
		damageBase = 13;
		AC = 5;
		frequency = "Scene x2";
		range = "10, 1 Target, Smite";
		type = "Electric";
		category = "Physical";
	}
	public Bolt_Strike(){}
}