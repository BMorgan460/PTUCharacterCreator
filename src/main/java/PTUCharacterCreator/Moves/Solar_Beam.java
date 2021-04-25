package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Solar_Beam extends Move {
	{
		name = "Solar Beam";
		effect = "Set-Up Effect: If the weather is not Sunny, the user’s turn ends. If the weather is Sunny, immediately proceed to the Resolution Effect instead and this Move loses the Set-Up keyword. Resolution Effect: The user attacks with Solar Beam. If the weather is Rainy, Sandstorming, or Hailing, Solar Beam’s Damage Base is lowered to 6 (2d6+8 / 15).";
		damageBase = 12;
		mDamageBase = 12;
		AC = 2;
		frequency = "Scene x2";
		range = "Line 6, 1 Target, Set-Up";
		type = "Grass";
		category = "Special";
	}
	public Solar_Beam(){}
}