package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Spectral_Thief extends Move {
	{
		name = "Spectral Thief";
		effect = "Before attacking, the user copies any Combat Stages the target has that are above 0.";
		damageBase = 9;
		AC = 2;
		frequency = "Scene";
		range = "Melee, 1 Target";
		type = "Ghost";
		category = "Physical";
	}
	public Spectral_Thief(){}
}