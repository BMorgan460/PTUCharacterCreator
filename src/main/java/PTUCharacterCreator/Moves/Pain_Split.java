package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Pain_Split extends Move {
	{
		name = "Pain Split";
		effect = "The user and the target both lose 1/2 of their current Hit Points. Add the amount of Hit Points the user and the target lost together, and divide the value by 2. Both the target and the user gain Hit Points equal to this value. Do not add Injuries from Pain Split from Hit Point Markers until the full effect of the Move has been resolved. Pain Split never causes Massive Damage. Hit Point loss from Pain Split cannot be prevented in any way.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Daily x2";
		range = "4, 1 Target";
		type = "Normal";
		category = "Status";
	}
	public Pain_Split(){}
}