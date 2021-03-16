package PTUCharacterCreator.Abilities;
import PTUCharacterCreator.Ability;
public class Soulstealer_Playtest extends Ability {
	{
		name = "Soulstealer [Playtest]";
		freq = "Scene - Free Action";
		effect = "Trigger: The user's attack causes a foe to Faint\nEffect: The user removes one Injury from themselves and gains Hit Points equal to 25% of their Max Hit Points. If the triggering attack killed its target, the user instead removes all Injuries and recovers Hit Points equal to 50% of the user's Max Hit Points.";
	}
	public Soulstealer_Playtest(){}
}