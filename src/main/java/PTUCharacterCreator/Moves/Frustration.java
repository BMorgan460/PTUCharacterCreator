package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Frustration extends Move {
	{
		name = "Frustration";
		effect = "Frustration's Damage Base is equal to 9 minus the user's Loyalty Value. Using Frustration may make your Pokemon dislike you.";
		damageBase = 9;
		AC = 2;
		frequency = "At-Will";
		range = "Melee, 1 Target";
		type = "Normal";
		category = "Physical";
	}
	public Frustration(){}
}