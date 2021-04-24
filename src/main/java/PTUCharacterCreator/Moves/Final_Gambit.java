package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Final_Gambit extends Move {
	{
		name = "Final Gambit";
		effect = "Final Gambit lowers the user to 0 Hit Points and causes them to Faint. Final Gambit then deals 1 point of damage to the target for every Hit Point lost by the user. Final Gambit does not cause items to activate.";
		damageBase = 0;
		AC = 2;
		frequency = "Scene";
		range = "Melee, 1 Target";
		type = "Fighting";
		category = "Special";
	}
	public Final_Gambit(){}
}