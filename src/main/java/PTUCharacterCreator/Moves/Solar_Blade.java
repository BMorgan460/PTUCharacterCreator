package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Solar_Blade extends Move {
	{
		name = "Solar Blade";
		effect = "Set-Up Effect: If the weather is not Sunny, the users turn ends. If the weather is Sunny, immediately proceed to the Resolution Effect. Resolution Effect: The user attacks with Solar Blade. If the weather is Rainy, Sandstorming, or Hailing, Solar Blade’s Damage Base is lowered to 6.";
		damageBase = 12;
		mDamageBase = 12;
		AC = 2;
		frequency = "Scene x2";
		range = "Line 6, Set-Up";
		type = "Grass";
		category = "Physical";
	}
	public Solar_Blade(){}
}