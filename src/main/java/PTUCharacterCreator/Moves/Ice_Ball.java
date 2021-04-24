package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Ice_Ball extends Move {
	{
		name = "Ice Ball";
		effect = "The user continues to use Ice Ball on each of its turns until they miss any target with Ice Ball or are not able to hit any target with Ice Ball during their turn. Each successive use of Ice Ball increases Ice Ball's Damage Base by +3 to a maximum of DB 15.";
		damageBase = 3;
		AC = 4;
		frequency = "At-Will";
		range = "Melee, 1 Target";
		type = "Ice";
		category = "Physical";
	}
	public Ice_Ball(){}
}