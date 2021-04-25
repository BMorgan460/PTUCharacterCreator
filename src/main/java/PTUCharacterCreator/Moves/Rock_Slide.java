package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Rock_Slide extends Move {
	{
		name = "Rock Slide";
		effect = "Rock Slide Flinches all legal targets on 17+.";
		damageBase = 8;
		mDamageBase = 8;
		AC = 4;
		frequency = "Scene x2";
		range = "6, Ranged Blast 3";
		type = "Rock";
		category = "Physical";
	}
	public Rock_Slide(){}
}