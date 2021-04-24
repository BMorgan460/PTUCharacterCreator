package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Psychic extends Move {
	{
		name = "Psychic";
		effect = "The target is Pushed 1 meter in any direction. Psychic lowers the target’s Special Defense 1 Combat Stage on 17+.  Grants Telekinetic.";
		damageBase = 9;
		AC = 2;
		frequency = "EOT";
		range = "5, 1 Target, Push";
		type = "Psychic";
		category = "Special";
	}
	public Psychic(){}
}