package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Leech_Life extends Move {
	{
		name = "Leech Life";
		effect = "After the target takes damage, the user gains HP equal to half of the damage they dealt to the target.";
		damageBase = 8;
		AC = 2;
		frequency = "Scene x2";
		range = "Melee, 1 Target";
		type = "Bug";
		category = "Physical";
	}
	public Leech_Life(){}
}