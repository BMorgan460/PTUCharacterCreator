package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Bug_Bite extends Move{
		{
		name = "Bug Bite";
		type = "Bug";
		frequency = "At-Will";
		AC = 2;
		damageBase = 6;
		mDamageBase = 6;
		category = "Physical";
		range = "Melee, 1 Target";
		effect = "If the target has a stored Digestion Buff or has traded in a Digestion Buff this Scene, the user may gain the effects of the Digestion Buff This does not count towards the usual limit on the user’s Digestion Buffs";
		}
                public Bug_Bite(){}
}