package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Poison_Fang extends Move {
	{
		name = "Poison Fang";
		effect = "Poison Fang Badly Poisons the target on 17+.";
		damageBase = 5;
		mDamageBase = 5;
		AC = 2;
		frequency = "EOT";
		range = "Melee, 1 Target";
		type = "Poison";
		category = "Physical";
	}
	public Poison_Fang(){}
}