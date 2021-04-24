package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Superpower extends Move {
	{
		name = "Superpower";
		effect = "Superpower lowers the user's Attack and Defense by 1 Combat Stage each.";
		damageBase = 12;
		AC = 2;
		frequency = "Scene x2";
		range = "Melee, 1 Target, Dash";
		type = "Fighting";
		category = "Physical";
	}
	public Superpower(){}
}