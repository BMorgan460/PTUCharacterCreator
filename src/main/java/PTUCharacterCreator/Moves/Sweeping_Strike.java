package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Sweeping_Strike extends Move {
	{
		name = "Sweeping Strike";
		effect = "You may attempt a Trip Maneuver against the target as a free action. Limitation: Short-Range Weapons or Weapons with the Reach Quality Only";
		damageBase = 9;
		AC = 3;
		frequency = "Scene x2";
		range = "WR, 1 Target";
		type = "Weapon";
		category = "Physical";
	}
	public Sweeping_Strike(){}
}