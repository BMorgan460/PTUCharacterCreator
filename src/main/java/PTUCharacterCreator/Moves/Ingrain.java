package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Ingrain extends Move {
	{
		name = "Ingrain";
		effect = "Ingrain applies a Coat to the user, which has the following effect, the user cannot be pushed or pulled, and cannot be switched out. At the beginning of each of the user's turn, the user gains HP equal to 1/10th of its max HP.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "Self, Coat";
		type = "Grass";
		category = "Status";
	}
	public Ingrain(){}
}