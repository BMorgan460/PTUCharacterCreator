package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Curse extends Move {
	{
		name = "Curse";
		effect = "If the user is not a Ghost Type, Curse has a Frequency of EOT, and when used the user lowers its Speed by -1 Combat Stage, but raises Attack and Defense by +1 Combat Stage each. If the user is a Ghost Type, Curse has a Frequency of Scene, and when used the user loses 1/3 of their Max Hit Points and a target Pokemon or Trainer within 8 meters of the user becomes Cursed. This Hit Point loss cannot be prevented in any way.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "See Text";
		range = "Self";
		type = "Ghost";
		category = "Status";
	}
	public Curse(){}
}