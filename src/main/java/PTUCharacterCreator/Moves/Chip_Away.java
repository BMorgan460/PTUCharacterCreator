package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Chip_Away extends Move {
	{
		name = "Chip Away";
		effect = "Ignore any Armor, Damage Reduction, or changes in the target's Defense or Special Defense (such as from Combat Stages) when calculating damage.";
		damageBase = 7;
		mDamageBase = 7;
		AC = 2;
		frequency = "EOT";
		range = "Melee, 1 Target";
		type = "Normal";
		category = "Physical";
	}
	public Chip_Away(){}
}