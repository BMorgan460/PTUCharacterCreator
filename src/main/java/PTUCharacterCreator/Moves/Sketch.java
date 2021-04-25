package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Sketch extends Move {
	{
		name = "Sketch";
		effect = "Sketch cannot miss. Once Sketch has been used, remove Sketch from the user's Move list. The last Move that the target used is added to the user's Move list permanently. Sketch may not be Interrupted or Intercepted.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Daily";
		range = "15, 1 Target";
		type = "Normal";
		category = "Status";
	}
	public Sketch(){}
}