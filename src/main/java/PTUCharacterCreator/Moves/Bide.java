package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Bide extends Move {
	{
		name = "Bide";
		effect = "The user may use Bide as a Reaction Move upon being Hit by a Damaging Move. During their next available turn, the user may Shift and then use Bide, causing all Adjacent foes to lose X HP, where X is the amount of Damage taken since declaring use of Bide (Loss of life through effects such as Poison is not ‘Damage’).";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "Burst 1, Friendly";
		type = "Normal";
		category = "Physical";
	}
	public Bide(){}
}