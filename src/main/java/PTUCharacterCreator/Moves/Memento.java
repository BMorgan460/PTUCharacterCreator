package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Memento extends Move {
	{
		name = "Memento";
		effect = "Memento may be used as a Free Action that does not consume a Command action when the user becomes Fainted. Lower each of the target's stats by -2 CS.";
		damageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "8, 1 Target, Trigger, Free Action";
		type = "Dark";
		category = "Status";
	}
	public Memento(){}
}