package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Photon_Geyser extends Move {
	{
		name = "Photon Geyser";
		effect = "If the user’s Attack is higher than its Special Attack, it may use this move as a Physical attack instead.";
		damageBase = 10;
		mDamageBase = 10;
		AC = 3;
		frequency = "Scene";
		range = "Line 6";
		type = "Psychic";
		category = "Special";
	}
	public Photon_Geyser(){}
}