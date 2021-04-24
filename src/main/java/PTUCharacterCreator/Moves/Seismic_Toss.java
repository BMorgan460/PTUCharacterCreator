package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Seismic_Toss extends Move {
	{
		name = "Seismic Toss";
		effect = "The target loses HP equal to the level of Seismic Toss's user. Do not apply weakness or resistance. Do not apply stats.";
		damageBase = 0;
		AC = 2;
		frequency = "Scene x2";
		range = "Melee, 1 Target";
		type = "Fighting";
		category = "Physical";
	}
	public Seismic_Toss(){}
}