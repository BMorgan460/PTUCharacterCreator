package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Role_Play extends Move {
	{
		name = "Role Play";
		effect = "The user gains one of the target's Abilities, chosen at random, for the remainder of the encounter. This effect ends if the user Faints or is switched out. Role Play cannot miss.";
		damageBase = 0;
		AC = 0;
		frequency = "Daily";
		range = "Melee, 1 Target";
		type = "Psychic";
		category = "Status";
	}
	public Role_Play(){}
}