package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Thunder extends Move {
	{
		name = "Thunder";
		effect = "Thunder Paralyzes the target on 15+. If the target is in Sunny Weather, Thunder's Accuracy Check is 11. If the target is in Rainy Weather, Thunder cannot miss. If the target is airborne as a result of Bounce, Fly, or Sky Drop, Thunder cannot miss.";
		damageBase = 11;
		AC = 7;
		frequency = "Scene x2";
		range = "12, 1 Target, Smite";
		type = "Electric";
		category = "Special";
	}
	public Thunder(){}
}