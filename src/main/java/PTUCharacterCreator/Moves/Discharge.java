package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Discharge extends Move {
	{
		name = "Discharge";
		effect = "Discharge Paralyzes all legal targets on 15+.";
		damageBase = 8;
		AC = 2;
		frequency = "EOT";
		range = "All Cardinally Adjacent Targets";
		type = "Electric";
		category = "Special";
	}
	public Discharge(){}
}