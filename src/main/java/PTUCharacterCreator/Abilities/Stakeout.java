package PTUCharacterCreator.Abilities;
import PTUCharacterCreator.Ability;
public class Stakeout extends Ability {
	{
		name = "Stakeout";
		freq = "At-Will - Free Action, Reaction";
		effect = "Trigger: An opponent is sent into battle or moves within 10 meters of the user. For movement, the triggering opponent must have been outside the 10 meter range prior to moving.\nEffect: For the remainder of the round, if the user uses a 1 target attack on the triggering opponent, the moves Damage Base is increased by 2 for the attack.";
	}
	public Stakeout(){}
}