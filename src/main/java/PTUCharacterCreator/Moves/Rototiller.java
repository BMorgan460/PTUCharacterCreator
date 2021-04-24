package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Rototiller extends Move {
	{
		name = "Rototiller";
		effect = "All Grass-type Pokemon in the area raise their Attack and Special Attack 1 Combat Stage.";
		damageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "Burst 2";
		type = "Ground";
		category = "Status";
	}
	public Rototiller(){}
}