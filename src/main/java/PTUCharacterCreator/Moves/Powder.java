package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Powder extends Move {
	{
		name = "Powder";
		effect = "The target is dusted with a Coat of flammable powder. If the affected target uses a damaging Fire-Type attack, the attack is negated and instead creates a Blast 3 centered on itself as the powder explodes, and the Coat is removed. All legal targets within the Blast take damage equal to what the user of the Fire-Type attack would roll for the damage of their attack. This damage is Typeless or Fire-Type, whichever would be more effective.";
		damageBase = 0;
		AC = 0;
		frequency = "Scene x2";
		range = "6, 1 Target, Interrupt, Powder";
		type = "Bug";
		category = "Status";
	}
	public Powder(){}
}