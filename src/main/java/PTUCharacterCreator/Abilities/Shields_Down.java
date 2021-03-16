package PTUCharacterCreator.Abilities;
import PTUCharacterCreator.Ability;
public class Shields_Down extends Ability {
	{
		name = "Shields Down";
		freq = "Scene - Free Action";
		effect = "Trigger: The user falls below 50% Hit Points.\nEffect: Keep 2 character sheets for the user, one for Meteor form, and one for Core form. The user is normally in Meteor form. When this ability triggers, the user switches to Core form.";
	}
	public Shields_Down(){}
}