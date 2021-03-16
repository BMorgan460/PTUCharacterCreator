package PTUCharacterCreator.Abilities;
import PTUCharacterCreator.Ability;
public class Lightning_Rod extends Ability {
	{
		name = "Lightning Rod";
		freq = "Scene -  Free Action";
		effect = "Trigger: A ranged Electric Type Move is used within 10 Meters of the user.\nEffect: The Move is turned into a Single-Target Move and is re-directed at the user without fail, and cannot miss. This negates Lock-On or Mind Reader. Additionally, the user is immune to the damage and effects of Electric Type attacks, and each time they are hit by an Electric attack, the user's Special Attack is raised 1 Combat Stage. Defensive.";
	}
	public Lightning_Rod(){}
}