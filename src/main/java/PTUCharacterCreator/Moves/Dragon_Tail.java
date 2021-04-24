package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Dragon_Tail extends Move {
	{
		name = "Dragon Tail";
		effect = "The target is Pushed 6 meters minus their Weight Class. The target is also Tripped on 15+.";
		damageBase = 6;
		AC = 3;
		frequency = "At-Will";
		range = "Melee, 1 Target, Push";
		type = "Dragon";
		category = "Physical";
	}
	public Dragon_Tail(){}
}