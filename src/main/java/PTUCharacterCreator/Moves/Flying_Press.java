package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Flying_Press extends Move {
	{
		name = "Flying Press";
		effect = "Flying Press may deal Flying Type damage if the user wishes. NOTE: If Flying Press is Move Sync'd, it only changes the Fighting Type portion of the Move. You can still only choose between that Type and Flying Type, you cannot shift Flying Press to change the Flying part to another Type.";
		damageBase = 8;
		mDamageBase = 8;
		AC = 3;
		frequency = "EOT";
		range = "Melee, Dash, 1 Target";
		type = "Fighting";
		category = "Physical";
	}
	public Flying_Press(){}
}