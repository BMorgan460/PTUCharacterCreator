package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Psystrike extends Move {
	{
		name = "Psystrike";
		effect = " When calculating damage, the target subtracts their Defense from Psystrike's damage instead of their Special Defense. Psystrike is still otherwise Special (Special Evasion is used to avoid it, Mirror Coat can reflect it, etc.)";
		damageBase = 10;
		AC = 2;
		frequency = "EOT";
		range = "4, 1 Target";
		type = "Psychic";
		category = "Special";
	}
	public Psystrike(){}
}