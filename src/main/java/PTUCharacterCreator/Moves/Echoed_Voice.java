package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Echoed_Voice extends Move {
	{
		name = "Echoed Voice";
		effect = "If Echoed Voice was used by any Pokemon or Trainer in the Encounter on the previous round, increase its Damage Base by +4. If Echoed Voice was used by any Pokemon or Trainers during both the previous two rounds, increase its Damage Base by +8.";
		damageBase = 4;
		AC = 2;
		frequency = "EOT";
		range = "3, 1 Target, Sonic";
		type = "Normal";
		category = "Special";
	}
	public Echoed_Voice(){}
}