package PTUCharacterCreator.Abilities;
import PTUCharacterCreator.Ability;
public class Weak_Armor extends Ability {
	{
		name = "Weak Armor";
		freq = "At-Will - Free Action";
		effect = "Trigger: The user takes Physical Damage\nEffect: The user may lower its Defense Combat Stage by 1 Combat Stage, and gain +1 Speed Combat Stage. This is done after the triggering damage is resolved.";
	}
	public Weak_Armor(){}
}