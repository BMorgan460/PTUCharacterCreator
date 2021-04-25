package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Hidden_Power extends Move {
	{
		name = "Hidden Power";
		effect = "When a Pokemon first obtains the Move Hidden Power, roll 1d20. Hidden Power’s Elemental Type will be changed from Normal to Bug on a result of 1, Dark on 2, Dragon on 3, Electric on 4, Fairy on 5, Fighting on 6, Fire on 7, Flying on 8, Ghost on 9, Grass on 10, Ground on 11, Ice on 12, Normal on 13, Poison on 14, Psychic on 15, Rock on 16, Steel on 17, Water on 18, and on 19 or 20, reroll until you roll another number. This effect is permanent – if Hidden Power is forgotten and relearned, the chosen Type remains the same.";
		damageBase = 6;
		mDamageBase = 6;
		AC = 2;
		frequency = "EOT";
		range = "Burst 1";
		type = "Normal";
		category = "Special";
	}
	public Hidden_Power(){}
}