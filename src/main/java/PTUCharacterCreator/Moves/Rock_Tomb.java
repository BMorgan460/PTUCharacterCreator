package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Rock_Tomb extends Move {
	{
		name = "Rock Tomb";
		effect = "Rock Tomb lowers the target's Speed by -1 CS. *Grants Materializer";
		damageBase = 6;
		mDamageBase = 6;
		AC = 5;
		frequency = "At-Will";
		range = "6, 1 Target";
		type = "Rock";
		category = "Physical";
	}
	public Rock_Tomb(){}
}