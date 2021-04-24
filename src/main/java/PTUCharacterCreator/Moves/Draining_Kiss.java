package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Draining_Kiss extends Move {
	{
		name = "Draining Kiss";
		effect = "The user gains HP equal to half of the damage the user dealt to the target.";
		damageBase = 5;
		AC = 2;
		frequency = "EOT";
		range = "Melee, 1 Target";
		type = "Fairy";
		category = "Special";
	}
	public Draining_Kiss(){}
}