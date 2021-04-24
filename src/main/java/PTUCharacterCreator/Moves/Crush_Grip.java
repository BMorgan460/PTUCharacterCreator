package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Crush_Grip extends Move {
	{
		name = "Crush Grip";
		effect = "For every 10% the target is below their full Hit Points, Crush Grip's Damage Base is reduced by 1.";
		damageBase = 12;
		AC = 2;
		frequency = "Scene";
		range = "Melee, 1 Target";
		type = "Normal";
		category = "Physical";
	}
	public Crush_Grip(){}
}