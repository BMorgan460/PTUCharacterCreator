package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Dream_Eater extends Move {
	{
		name = "Dream Eater";
		effect = "Dream Eater can only target Sleeping Pokemon or Trainers. After the target takes damage, the user gains Hit Points equal to half of the damage they dealt to the target. Dream Eater does not wake up sleeping targets.";
		damageBase = 10;
		mDamageBase = 10;
		AC = 2;
		frequency = "EOT";
		range = "Melee, 1 Target";
		type = "Psychic";
		category = "Special";
	}
	public Dream_Eater(){}
}