package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Feint_Attack extends Move {
	{
		name = "Feint Attack";
		effect = "Feint Attack Cannot Miss.";
		damageBase = 6;
		AC = 0;
		frequency = "EOT";
		range = "Melee, 1 Target";
		type = "Dark";
		category = "Physical";
	}
	public Feint_Attack(){}
}