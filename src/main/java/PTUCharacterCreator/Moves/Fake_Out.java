package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Fake_Out extends Move {
	{
		name = "Fake Out";
		effect = "You may only use Fake Out with Priority upon joining an encounter, if you do, Fake Out Flinches the target. Switching out resets the requirement of joining an encounter.";
		damageBase = 4;
		AC = 2;
		frequency = "At-Will";
		range = "Melee, 1 Target, Priority";
		type = "Normal";
		category = "Physical";
	}
	public Fake_Out(){}
}