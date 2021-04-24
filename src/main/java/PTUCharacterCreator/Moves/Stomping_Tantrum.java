package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Stomping_Tantrum extends Move {
	{
		name = "Stomping Tantrum";
		effect = "If the user’s last attack missed, Stomping Tantrum’s Damage Base is 14.";
		damageBase = 8;
		AC = 2;
		frequency = "EOT";
		range = "Melee, Burst 1";
		type = "Ground";
		category = "Physical";
	}
	public Stomping_Tantrum(){}
}