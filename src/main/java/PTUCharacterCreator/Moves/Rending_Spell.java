package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Rending_Spell extends Move {
	{
		name = "Rending Spell";
		effect = "The target loses a Tick of Hit Points on 16+.";
		damageBase = 3;
		AC = 2;
		frequency = "EOT";
		range = "WR, 1 Target";
		type = "Weapon";
		category = "Special";
	}
	public Rending_Spell(){}
}