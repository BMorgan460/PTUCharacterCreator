package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Rock_Climb extends Move {
	{
		name = "Rock Climb";
		effect = "Rock Climb Confuses the target on 17+.";
		damageBase = 8;
		AC = 5;
		frequency = "At-Will";
		range = "Melee, 1 Target, Dash";
		type = "Normal";
		category = "Physical";
	}
	public Rock_Climb(){}
}