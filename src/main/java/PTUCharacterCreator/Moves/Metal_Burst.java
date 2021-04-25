package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Metal_Burst extends Move {
	{
		name = "Metal Burst";
		effect = "Metal Burst causes all legal targets in the burst to lose HP equal to the total amount of direct Damage the user has taken since the beginning of this Round. Metal Burst cannot miss.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "Burst 1";
		type = "Steel";
		category = "Physical";
	}
	public Metal_Burst(){}
}