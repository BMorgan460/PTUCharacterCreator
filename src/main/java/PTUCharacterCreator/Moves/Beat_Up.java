package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Beat_Up extends Move {
	{
		name = "Beat Up";
		effect = "The user and up to two allies adjacent to the target may each make a Struggle Attack against the target. These Struggle Attacks hit for Dark-Type Damage instead of their usual Type. Beat Up may trigger Pack Hunt only once, no matter the number of attacks.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "EOT";
		range = "Melee, 1 Target";
		type = "Dark";
		category = "Physical";
	}
	public Beat_Up(){}
}