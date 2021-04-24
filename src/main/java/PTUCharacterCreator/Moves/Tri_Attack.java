package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Tri_Attack extends Move {
	{
		name = "Tri Attack";
		effect = "Tri Attack gives the target a Status ailment on 17+. If this effect is triggered, roll 1d3, on 1 the target is Paralyzed, on 2 the target is Burned, on 3 the target is Frozen.";
		damageBase = 8;
		AC = 2;
		frequency = "EOT";
		range = "6, 1 Target";
		type = "Normal";
		category = "Special";
	}
	public Tri_Attack(){}
}