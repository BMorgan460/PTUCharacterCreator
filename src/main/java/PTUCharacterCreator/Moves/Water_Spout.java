package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Water_Spout extends Move {
	{
		name = "Water Spout";
		effect = "For each 10% of HP the user is missing, Water Spout's Damage Base is reduced by -1. Water Spout creates a 1 meter burst, but also affects an area 10 meters tall straight up.";
		damageBase = 15;
		AC = 4;
		frequency = "Daily";
		range = "Burst 1*";
		type = "Water";
		category = "Special";
	}
	public Water_Spout(){}
}