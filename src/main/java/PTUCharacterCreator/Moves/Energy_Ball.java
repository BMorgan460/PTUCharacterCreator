package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Energy_Ball extends Move {
	{
		name = "Energy Ball";
		effect = "Energy Ball lowers the foe’s Special Defense 1 Combat Stage on 17+.";
		damageBase = 9;
		AC = 2;
		frequency = "EOT";
		range = "8, 1 Target";
		type = "Grass";
		category = "Special";
	}
	public Energy_Ball(){}
}