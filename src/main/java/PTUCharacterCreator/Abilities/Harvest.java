package PTUCharacterCreator.Abilities;
import PTUCharacterCreator.Ability;
public class Harvest extends Ability {
	{
		name = "Harvest";
		freq = "At Will - Free Action";
		effect = "Trigger: \nEffect: Whenever the user trades in a Digestion/Food Buff from a Berry, flip a coin. On heads, the user gains all the benefits of the Digestion/Food Buff, but the Buff is not used up. On tails, the Buff is consumed normally. While in Sunny Weather, the Buff is never consumed. The user may trade in a Digestion/Food Buff up to once per turn during an encounter, but only until they flip Tails.";
	}
	public Harvest(){}
}