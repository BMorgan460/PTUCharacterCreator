package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Leer extends Move {
	{
		name = "Leer";
		effect = "All legal targets have their Defense lowered by -1 CS.";
		damageBase = 0;
		AC = 2;
		frequency = "At-Will";
		range = "Cone 2, Friendly, Social";
		type = "Normal";
		category = "Status";
	}
	public Leer(){}
}