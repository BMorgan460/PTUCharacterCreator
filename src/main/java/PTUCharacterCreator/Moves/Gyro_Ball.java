package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Gyro_Ball extends Move {
	{
		name = "Gyro Ball";
		effect = "The target reveals their Speed Stat (including Combat Stages). If it is higher than the user’s (including Combat Stages), subtract the user’s Speed Stat from the target’s and apply the difference as Bonus Damage.";
		damageBase = 6;
		mDamageBase = 6;
		AC = 2;
		frequency = "Scene x2";
		range = "6, 1 Target";
		type = "Steel";
		category = "Physical";
	}
	public Gyro_Ball(){}
}