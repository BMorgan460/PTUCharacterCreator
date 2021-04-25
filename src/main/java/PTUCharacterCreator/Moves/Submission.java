package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Submission extends Move {
	{
		name = "Submission";
		effect = "On an accuracy roll of 15+, the target is Tripped.";
		damageBase = 8;
		mDamageBase = 8;
		AC = 6;
		frequency = "At-Will";
		range = "Melee, 1 Target, Recoil 1/3";
		type = "Fighting";
		category = "Physical";
	}
	public Submission(){}
}