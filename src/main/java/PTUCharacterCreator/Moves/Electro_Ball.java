package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Electro_Ball extends Move {
	{
		name = "Electro Ball";
		effect = "When determining the damage dealt by Electro Ball, the user adds its Speed Stat (including CS) in addition to their Special Attack Stat. The target in turn subtracts both its Speed and Special Defense Stats from the damage dealt before applying Type Effectiveness.";
		damageBase = 6;
		mDamageBase = 6;
		AC = 2;
		frequency = "Scene x2";
		range = "10, 1 Target";
		type = "Electric";
		category = "Special";
	}
	public Electro_Ball(){}
}