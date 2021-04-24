package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Psyshock extends Move {
	{
		name = "Psyshock";
		effect = "When calculating damage, the target subtracts their Defense from Psyshock's damage instead of their Special Defense. Psyshock is still otherwise Special (Special Evasion is used to avoid it, Mirror Coat can reflect it, etc.)";
		damageBase = 8;
		AC = 2;
		frequency = "At-Will";
		range = "4, 1 Target";
		type = "Psychic";
		category = "Special";
	}
	public Psyshock(){}
}