package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Wonder_Room extends Move {
	{
		name = "Wonder Room";
		effect = "For 5 rounds, the area is considered Wondered. While Wondered, each individual Pokemon's Defense and Special Defense are switched.";
		damageBase = 0;
		AC = 0;
		frequency = "Daily x2";
		range = "Field";
		type = "Psychic";
		category = "Status";
	}
	public Wonder_Room(){}
}