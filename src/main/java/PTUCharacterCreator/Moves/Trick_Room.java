package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Trick_Room extends Move {
	{
		name = "Trick Room";
		effect = "Starting at the beginning of the next round, for 5 rounds, the area is considered Rewinding. While Rewinding, Initiative is reversed, and participants instead go from lowest Initiative to highest.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Daily x2";
		range = "Field";
		type = "Psychic";
		category = "Status";
	}
	public Trick_Room(){}
}