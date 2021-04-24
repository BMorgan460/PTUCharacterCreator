package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Drain_Punch extends Move {
	{
		name = "Drain Punch";
		effect = "After the target takes damage, the user gains HP equal to half of the damage it dealt to the target.";
		damageBase = 8;
		AC = 2;
		frequency = "Scene x2";
		range = "Melee, 1 Target, Aura";
		type = "Fighting";
		category = "Physical";
	}
	public Drain_Punch(){}
}