package PTUCharacterCreator.Abilities;
import PTUCharacterCreator.Ability;
public class Soulstealer extends Ability {
	{
		name = "Soulstealer";
		freq = "Scene - Free Action";
		effect = "Trigger: The user's attack causes a foe to Faint\nEffect: The user removes one Injury from themselves and recovers 25% of their Maximum Hit Points. If the triggering attack killed its target, the user instead removes all Injuries and recovers all Hit Points.";
	}
	public Soulstealer(){}
}