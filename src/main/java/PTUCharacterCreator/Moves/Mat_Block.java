package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Mat_Block extends Move {
	{
		name = "Mat Block";
		effect = "If the user or an adjacent ally is hit by a damagin attack, the user may use Mat Block. The attack instead does not hit any targets, and it deals no damage and has no effects. You may only use Mat Block during the first round of an encounter";
		damageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "Self, Trigger, Interrupt, Shield";
		type = "Fighting";
		category = "Status";
	}
	public Mat_Block(){}
}