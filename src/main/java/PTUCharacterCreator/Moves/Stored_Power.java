package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Stored_Power extends Move {
	{
		name = "Stored Power";
		effect = "For every Combat Stage the user has above 0, add +2 to Stored Power’s Damage Base, up to a maximum of Damage Base 20.";
		damageBase = 2;
		AC = 2;
		frequency = "EOT";
		range = "10, 1 Target";
		type = "Psychic";
		category = "Special";
	}
	public Stored_Power(){}
}