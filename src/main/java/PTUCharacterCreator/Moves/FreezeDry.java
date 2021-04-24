package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class FreezeDry extends Move {
	{
		name = "Freeze-Dry";
		effect = "When calculating Weakness and Resistance for Freeze-Dry, Water-Typed targets calculate damage as if Water was weak to Ice.";
		damageBase = 7;
		AC = 2;
		frequency = "EOT";
		range = "6, 1 Target";
		type = "Ice";
		category = "Special";
	}
	public FreezeDry(){}
}