package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Stomp extends Move {
	{
		name = "Stomp";
		effect = "Stomp Flinches the target on 15+. If the target is at least one size category smaller than the user, Stomp deals an additional 10 damage.";
		damageBase = 7;
		mDamageBase = 7;
		AC = 2;
		frequency = "EOT";
		range = "Melee, 1 Target";
		type = "Normal";
		category = "Physical";
	}
	public Stomp(){}
}