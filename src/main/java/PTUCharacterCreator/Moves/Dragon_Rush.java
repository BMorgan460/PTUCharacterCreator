package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Dragon_Rush extends Move {
	{
		name = "Dragon Rush";
		effect = "The target is Pushed 3 Meters. Dragon Rush Flinches the target on 17+.";
		damageBase = 10;
		AC = 4;
		frequency = "Scene x2";
		range = "Melee, 1 Target, Dash, Push, Smite";
		type = "Dragon";
		category = "Physical";
	}
	public Dragon_Rush(){}
}