package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Skill_Swap extends Move {
	{
		name = "Skill Swap";
		effect = "The user loses one of their Abilities, selected by the user, and gains one the target’s Abilities, selected at random, for the remainder of encounter. The target loses the copied Ability, and gains the user’s lost Ability. This effect ends if either the target or the user is Switched out or Fainted, but only for that Pokemon or Trainer.";
		damageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "Melee, 1 Target";
		type = "Psychic";
		category = "Status";
	}
	public Skill_Swap(){}
}