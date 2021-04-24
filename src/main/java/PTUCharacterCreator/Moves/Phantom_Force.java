package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Phantom_Force extends Move {
	{
		name = "Phantom Force";
		effect = "Set-Up Effect: The user is removed from the field, and their turn ends. Resolution Effect: Phantom Force’s user appears adjacent to any legal target on the field, ignoring Movement Capabilities, and then uses Phantom Force’s attack. Phantom Force cannot be avoided by Moves with the Shield Keyword, the Dodge Ability, or similar effects, and Intercepts may not be attempted in response.";
		damageBase = 9;
		AC = 2;
		frequency = "Scene x2";
		range = "Melee, 1 Target, Set-Up";
		type = "Ghost";
		category = "Physical";
	}
	public Phantom_Force(){}
}