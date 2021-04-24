package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Instruct extends Move {
	{
		name = "Instruct";
		effect = "The target of this attack may attack once during the user’s turn as an interrupt action, using the last move they used as if it had the Interrupt keyword. Using a move this way disregards Frequency.";
		damageBase = 0;
		AC = 0;
		frequency = "Daily x2";
		range = "6, 1 Target";
		type = "Psychic";
		category = "Status";
	}
	public Instruct(){}
}