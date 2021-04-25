package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Heal_Block extends Move {
	{
		name = "Heal Block";
		effect = "Until the end of the encounter, the target may not gain HP or Temporary HP from any source. This effect ends if the target is switched out or Takes a Breather.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 2;
		frequency = "EOT";
		range = "6, 1 Target";
		type = "Psychic";
		category = "Status";
	}
	public Heal_Block(){}
}