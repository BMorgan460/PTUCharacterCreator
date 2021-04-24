package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Hurricane extends Move {
	{
		name = "Hurricane";
		effect = "Hurricane Confuses its target on 15+. If the target is in Sunny Weather, Hurricane's Accuracy Check is 11. If the target is in Rainy Weather, Hurricane cannot miss. If the target is airborne as a result of Bounce, Fly, or Sky Drop, Hurricane cannot miss.";
		damageBase = 11;
		AC = 7;
		frequency = "Scene x2";
		range = "Burst 1, Smite";
		type = "Flying";
		category = "Special";
	}
	public Hurricane(){}
}