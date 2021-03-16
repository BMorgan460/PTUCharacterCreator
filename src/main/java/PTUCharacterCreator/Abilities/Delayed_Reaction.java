package PTUCharacterCreator.Abilities;
import PTUCharacterCreator.Ability;
public class Delayed_Reaction extends Ability {
	{
		name = "Delayed Reaction";
		freq = "Scene -  Free Action";
		effect = "Trigger: The user is hit by a direct damaging attack\nEffect: Halve the damage taken by the user. At the end of the user's next turn, the user loses Hit Points equal to the other half of the damage. For example, if the user is hit for 11 damage and triggers this Ability, the user would take 5 damage upon being hit and 6 damage at the end of its next turn. Defensive.";
	}
	public Delayed_Reaction(){}
}