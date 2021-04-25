package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Strength_Sap extends Move {
	{
		name = "Strength Sap";
		effect = "The user regains Hit Points equal to the targets Attack stat (including Combat Stages), then reduces the targets Attack Combat Stage by 1.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Daily x2";
		range = "3, 1 Target";
		type = "Grass";
		category = "Status";
	}
	public Strength_Sap(){}
}