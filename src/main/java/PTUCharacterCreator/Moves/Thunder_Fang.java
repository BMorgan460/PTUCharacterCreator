package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Thunder_Fang extends Move {
	{
		name = "Thunder Fang";
		effect = "Thunder Fang Paralyzes or Flinches on 18-19, flip a coin to determine whether the foe becomes Paralyzed or Flinched. On 20, the foe is both Paralyzed and Flinched.";
		damageBase = 7;
		mDamageBase = 7;
		AC = 3;
		frequency = "At-Will";
		range = "Melee, 1 Target";
		type = "Electric";
		category = "Physical";
	}
	public Thunder_Fang(){}
}