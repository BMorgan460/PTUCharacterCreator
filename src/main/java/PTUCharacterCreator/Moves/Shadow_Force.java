package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Shadow_Force extends Move {
	{
		name = "Shadow Force";
		effect = "Set-Up Effect: The user is removed from the field, and their turn ends. Resolution Effect: Shadow Force’s user appears adjacent to any legal target on the field, ignoring Movement Capabilities, and then uses Shadow Force’s attack. Shadow Force cannot be avoided by Moves with the Shield Keyword, the Dodge Ability, or similar effects, and Intercepts may not be attempted in response.";
		damageBase = 12;
		AC = 2;
		frequency = "Daily x3";
		range = "Melee, 1 Target, Set-Up";
		type = "Ghost";
		category = "Physical";
	}
	public Shadow_Force(){}
}