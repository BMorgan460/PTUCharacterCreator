package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Gust extends Move {
	{
		name = "Gust";
		effect = "If the target is airborne as a result of Bounce, Fly, or Sky Drop, Gust can hit them, ignoring Range and has a Damage Base of 8 instead. *Grants: Guster";
		damageBase = 4;
		AC = 2;
		frequency = "At-Will";
		range = "4, 1 Target";
		type = "Flying";
		category = "Special";
	}
	public Gust(){}
}