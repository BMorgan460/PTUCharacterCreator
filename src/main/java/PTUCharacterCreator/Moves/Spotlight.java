package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Spotlight extends Move {
	{
		name = "Spotlight";
		effect = "Until the end of the users next turn, all foes must target the target of Spotlight when using a move that target’s one of their opponents. This effect ends if Spotlight’s target faints or is switched out.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Scene x2";
		range = "6, 1 Target, Social";
		type = "Normal";
		category = "Status";
	}
	public Spotlight(){}
}