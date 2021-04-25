package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Steamroller extends Move {
	{
		name = "Steamroller";
		effect = "Steamroller Flinches the target on 15+. If the target is Small, Steamroller deals an additional +5 Damage.";
		damageBase = 7;
		mDamageBase = 7;
		AC = 2;
		frequency = "EOT";
		range = "Melee, Pass";
		type = "Bug";
		category = "Physical";
	}
	public Steamroller(){}
}