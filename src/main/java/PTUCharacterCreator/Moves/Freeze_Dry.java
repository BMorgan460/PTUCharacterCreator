package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Freeze_Dry extends Move{
		{
		name = "Freeze-Dry";
		type = "Ice";
		frequency = "EOT";
		AC = 2;
		damageBase = 7;
		mDamageBase = 7;
		category = "Special";
		range = "6, 1 Target";
		effect = "When calculating Weakness and Resistance for Freeze-Dry, Water-Typed targets calculate damage as if Water was weak to Ice";
		}
                public Freeze_Dry(){}
}