package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Wear_Down extends Move {
	{
		name = "Wear Down";
		effect = "Wear Down lowers the target’s Defense by 1 Combat Stage on Even-Numbered Rolls.";
		damageBase = 5;
		AC = 2;
		frequency = "EOT";
		range = "WR, 1 Target";
		type = "Weapon";
		category = "Physical";
	}
	public Wear_Down(){}
}