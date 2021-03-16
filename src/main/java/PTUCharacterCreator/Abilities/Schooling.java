package PTUCharacterCreator.Abilities;
import PTUCharacterCreator.Ability;
public class Schooling extends Ability {
	{
		name = "Schooling";
		freq = "At-Will - Free Action";
		effect = "Trigger: The user falls below 25% Hit Points while in School Form\nEffect: Keep 2 character sheets for the user, one for Single form and one for School form. The user uses Single form while below level 20, and switches to School form once it reaches level 20. When this ability triggers, the user switches from School form to Single form. If the user goes back above 25% Hit Points, they may return to School Form.";
	}
	public Schooling(){}
}