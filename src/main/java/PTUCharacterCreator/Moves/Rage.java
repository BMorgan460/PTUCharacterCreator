package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Rage extends Move {
	{
		name = "Rage";
		effect = "The user becomes Enraged. Until the end of the user’s next turn, if the user is Enraged, the user gains +1 Attack Combat Stage whenever they are damaged by an Damaging Move or Attack.";
		damageBase = 2;
		mDamageBase = 2;
		AC = 2;
		frequency = "At-Will";
		range = "Melee, 1 Target, Spirit Surge";
		type = "Normal";
		category = "Physical";
	}
	public Rage(){}
}