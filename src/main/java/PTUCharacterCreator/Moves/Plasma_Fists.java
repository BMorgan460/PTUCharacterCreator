package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Plasma_Fists extends Move {
	{
		name = "Plasma Fists";
		effect = "For the rest of the Scene, the user may use its Normal-type moves as Electric-type moves.";
		damageBase = 10;
		AC = 3;
		frequency = "Scene";
		range = "Melee, 1 Target, Aura";
		type = "Electric";
		category = "Physical";
	}
	public Plasma_Fists(){}
}