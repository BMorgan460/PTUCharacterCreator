package PTUCharacterCreator.Abilities;
import PTUCharacterCreator.Ability;
public class Sturdy_Playtest extends Ability {
	{
		name = "Sturdy [Playtest]";
		freq = "Static";
		effect = "Trigger: \nEffect: The user is immune to Moves with the Execute Keyword. If a single source of Damage or Hit Point Loss would cause the user to lose more than X Hit Points, the damage or Hit Point loss is instead reduced to X. X is equal to 50% of their Max Hit Points. Defensive.";
	}
	public Sturdy_Playtest(){}
}