package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Stockpile extends Move {
	{
		name = "Stockpile";
		effect = "The user adds 1 to their Stockpiled count to a maximum of 3. For each number a Stockpiled count is above 0, raise the user’s Defense and Special Defense by +1 CS each. If a Stockpiled count is set to 0, any Combat Stages gained from the Stockpiled count are removed.";
		damageBase = 0;
		AC = 0;
		frequency = "EOT";
		range = "Self";
		type = "Normal";
		category = "Status";
	}
	public Stockpile(){}
}