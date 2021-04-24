package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Sandstorm extends Move {
	{
		name = "Sandstorm";
		effect = "The weather changes to a Sandstorm for 5 rounds. While it is Sandstorming, all non-Ground, Rock, or Steel Type Pokemon lose a Tick of Hit Points at the beginning of their turn.";
		damageBase = 0;
		AC = 0;
		frequency = "Daily x2";
		range = "Field, Weather";
		type = "Rock";
		category = "Status";
	}
	public Sandstorm(){}
}