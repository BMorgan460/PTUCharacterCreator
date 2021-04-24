package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Circle_Throw extends Move {
	{
		name = "Circle Throw";
		effect = "The target is Pushed 6 meters minus their Weight Class. The target is also Tripped on 15+.";
		damageBase = 6;
		AC = 4;
		frequency = "At-Will";
		range = "Melee, 1 Target, Push";
		type = "Fighting";
		category = "Physical";
	}
	public Circle_Throw(){}
}