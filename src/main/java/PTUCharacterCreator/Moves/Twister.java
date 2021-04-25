package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Twister extends Move {
	{
		name = "Twister";
		effect = "Twister Flinches the target on 18+. Small or Medium targets in the central square of the blast are not hit. Any Pokemon Airborne as a result of Bounce, Fly, or Sky Drop above the Blast are hit, ignoring range, and Twister has a Damage Base of 8 against those targets instead.";
		damageBase = 4;
		mDamageBase = 4;
		AC = 2;
		frequency = "At-Will";
		range = "6, Ranged Blast 3";
		type = "Dragon";
		category = "Special";
	}
	public Twister(){}
}