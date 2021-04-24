package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Minimize extends Move {
	{
		name = "Minimize";
		effect = "The user gains +4 Evasion, and the user's size is lowered to Small for the remainder of the encounter. *Grants Shrinkable";
		damageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "Self";
		type = "Normal";
		category = "Status";
	}
	public Minimize(){}
}