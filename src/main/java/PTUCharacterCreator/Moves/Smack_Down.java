package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Smack_Down extends Move {
	{
		name = "Smack Down";
		effect = "The target is knocked down to ground level, and loses all Sky or Levitate Speeds for 3 turns. During this time, they may be hit by Ground-Type Moves even if normally immune.";
		damageBase = 5;
		AC = 2;
		frequency = "Scene x2";
		range = "8, 1 Target";
		type = "Rock";
		category = "Physical";
	}
	public Smack_Down(){}
}