package PTUCharacterCreator.Abilities;
import PTUCharacterCreator.Ability;
public class Pickpocket extends Ability {
	{
		name = "Pickpocket";
		freq = "Scene -  Free Action";
		effect = "Trigger: The user is hit by an opponent with a Melee Move\nEffect: If the opponent has a Held Item and the user does not, the user takes the Held Item the opponent is holding.";
	}
	public Pickpocket(){}
}