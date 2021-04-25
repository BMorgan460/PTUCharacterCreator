package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Shadow_Bone extends Move {
	{
		name = "Shadow Bone";
		effect = "Shadow Bone lowers the targets Defense by 1 Combat Stage on 19+.";
		damageBase = 9;
		mDamageBase = 9;
		AC = 3;
		frequency = "EOT";
		range = "Melee, 1 Target";
		type = "Ghost";
		category = "Physical";
	}
	public Shadow_Bone(){}
}