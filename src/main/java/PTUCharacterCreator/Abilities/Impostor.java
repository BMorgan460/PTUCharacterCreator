package PTUCharacterCreator.Abilities;
import PTUCharacterCreator.Ability;
public class Impostor extends Ability {
	{
		name = "Impostor";
		freq = "At-Will";
		effect = "Trigger: Ditto enters the encounter\nEffect: When Ditto is sent out, it may use the Move Transform as a free action. If the target of Transform has any modified Combat Stages, apply these Combat Stages to Ditto. One of the target's Abilities is randomly assigned to Ditto until Ditto uses Transform again.";
	}
	public Impostor(){}
}