package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Trump_Card extends Move {
	{
		name = "Trump Card";
		effect = "Whenever the user uses Trump Card, the user gains a Trump Count after the attack is resolved. Trump Card's DB is increased by +2 for each Trump Count.";
		damageBase = 6;
		AC = 2;
		frequency = "EOT";
		range = "6, 1 Target";
		type = "Normal";
		category = "Special";
	}
	public Trump_Card(){}
}