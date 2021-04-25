package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Earthquake extends Move {
	{
		name = "Earthquake";
		effect = "Earthquake can hit targets that are underground, including those using the Move Dig. *Grants Groundshaper";
		damageBase = 10;
		mDamageBase = 10;
		AC = 2;
		frequency = "Scene";
		range = "Burst 3, Groundsource";
		type = "Ground";
		category = "Physical";
	}
	public Earthquake(){}
}