package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Smokescreen extends Move {
	{
		name = "Smokescreen";
		effect = "Smokescreen creates a blast of Smoke that covers the target area, the Smoke persists until the end of the encounter, or until Defog or Whirlwind are used. All targets attacking from or into the Smoke receive a -3 penalty to Accuracy.";
		damageBase = 0;
		AC = 0;
		frequency = "EOT";
		range = "5, Ranged Blast 3";
		type = "Normal";
		category = "Status";
	}
	public Smokescreen(){}
}