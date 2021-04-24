package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Thousand_Arrows extends Move {
	{
		name = "Thousand Arrows";
		effect = "When calculating Weakness and Resistance for Thousand Arrows, Flying-Typed targets calculate damage as if Flying was neutral to Ground. Thousand Arrows ignores the Levitate ability. The target is knocked down to ground level, and loses all Sky or Levitate Speeds for 3 turns. During this time, they may be hit by Ground-Type Moves even if normally immune.";
		damageBase = 9;
		AC = 2;
		frequency = "Scene";
		range = "6, 1 Target";
		type = "Ground";
		category = "Physical";
	}
	public Thousand_Arrows(){}
}