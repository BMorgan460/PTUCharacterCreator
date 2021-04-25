package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Psywave extends Move {
	{
		name = "Psywave";
		effect = "Roll 1d4, on 1 the target loses HP equal to half the user's Level, on 2 the target loses HP equal to the user's Level, on 3 the target loses HP equal to 1.5x the user's level, on 4 the target loses HP equal to the user's Level doubled. Do not apply weakness or resistance, and do not apply Stats. Do apply Immunity.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 5;
		frequency = "Scene";
		range = "6, 1 Target";
		type = "Psychic";
		category = "Special";
	}
	public Psywave(){}
}