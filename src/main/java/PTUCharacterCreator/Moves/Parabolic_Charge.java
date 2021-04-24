package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Parabolic_Charge extends Move {
	{
		name = "Parabolic Charge";
		effect = "The user gains HP equal to half of the total damage the user dealt to all legal targets.";
		damageBase = 5;
		AC = 4;
		frequency = "Scene";
		range = "Cone 2";
		type = "Electric";
		category = "Special";
	}
	public Parabolic_Charge(){}
}