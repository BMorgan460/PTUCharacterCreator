package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Rest extends Move {
	{
		name = "Rest";
		effect = "The user is set to their full Hit Point value. The user is cured of any Status ailments. Then, the user falls Asleep. The user cannot make Sleep Checks at the beginning of their turn. They are cured of the Sleep at the end of their turn in 2 rounds.";
		damageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "Self";
		type = "Psychic";
		category = "Status";
	}
	public Rest(){}
}