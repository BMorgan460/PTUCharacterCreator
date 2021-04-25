package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Ice_Fang extends Move {
	{
		name = "Ice Fang";
		effect = "Ice Fang Freezes or Flinches on 18-19 during Accuracy Check, flip a coin to determine whether the foe becomes Frozen or Flinched. On 20 during Accuracy Check, the foe is both Frozen and Flinched.";
		damageBase = 7;
		mDamageBase = 7;
		AC = 3;
		frequency = "At-Will";
		range = "Melee, 1 Target";
		type = "Ice";
		category = "Physical";
	}
	public Ice_Fang(){}
}