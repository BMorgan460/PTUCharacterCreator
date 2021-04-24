package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Fiery_Dance extends Move {
	{
		name = "Fiery Dance";
		effect = "If Fiery Dance successfully hits a foe, it raises the user's Special Attack by 1 Combat Stage on Even-Numbered Rolls.";
		damageBase = 8;
		AC = 2;
		frequency = "EOT";
		range = "4, 1 Target";
		type = "Fire";
		category = "Special";
	}
	public Fiery_Dance(){}
}