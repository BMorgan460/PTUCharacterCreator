package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Sky_Attack extends Move {
	{
		name = "Sky Attack";
		effect = "Set-Up Effect: The user is moved up 25 meters into the air. Resolution Effect: The user may shift until they are next to a legal target in the encounter. They may then shift again and pass through legal targets to attack with Sky Attack. Sky Attack Flinches a target on 17+.";
		damageBase = 14;
		mDamageBase = 14;
		AC = 4;
		frequency = "Scene x2";
		range = "Melee, Pass, Set-Up, Full Action";
		type = "Flying";
		category = "Physical";
	}
	public Sky_Attack(){}
}