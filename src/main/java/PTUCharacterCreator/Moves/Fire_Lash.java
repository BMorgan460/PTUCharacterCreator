package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Fire_Lash extends Move {
	{
		name = "Fire Lash";
		effect = "Fire Lash lowers the targets Defense 1 Combat Stage";
		damageBase = 8;
		mDamageBase = 8;
		AC = 2;
		frequency = "EOT";
		range = "4, 1 Target";
		type = "Fire";
		category = "Physical";
	}
	public Fire_Lash(){}
}