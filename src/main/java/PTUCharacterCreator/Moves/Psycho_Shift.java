package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Psycho_Shift extends Move {
	{
		name = "Psycho Shift";
		effect = "The user is cured of a Status ailment and the target is given that Status ailment. Psycho Shift cannot miss. Psycho Shift can only be used if the user has a Status ailment and the target does not have the status ailment that is being transferred.";
		damageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "Melee, 1 Target";
		type = "Psychic";
		category = "Status";
	}
	public Psycho_Shift(){}
}