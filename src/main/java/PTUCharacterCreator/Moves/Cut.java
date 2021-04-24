package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Cut extends Move {
	{
		name = "Cut";
		effect = "Cut ignores up to 5 Damage Reduction (Defenses are not Damage Reduction.)";
		damageBase = 5;
		AC = 3;
		frequency = "At-Will";
		range = "Melee, Pass";
		type = "Normal";
		category = "Physical";
	}
	public Cut(){}
}