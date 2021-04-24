package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Fire_Fang extends Move {
	{
		name = "Fire Fang";
		effect = "Fire Fang Burns or Flinches on 18-19 during Accuracy Check, flip a coin to determine whether the foe becomes Burned or Flinched. On 20 during Accuracy Check, the foe is both Burned and Flinched.";
		damageBase = 7;
		AC = 3;
		frequency = "At-Will";
		range = "Melee, 1 Target";
		type = "Fire";
		category = "Physical";
	}
	public Fire_Fang(){}
}