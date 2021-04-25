package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Defense_Curl extends Move {
	{
		name = "Defense Curl";
		effect = "The user becomes Curled Up. While Curled Up, the user becomes immune to Critical Hits and gains 10 Damage Reduction. However, while Curled Up, the user is Slowed and their Accuracy is lowered by -4. The user may stop being Curled Up as a Swift Action. If the user has Rollout or Ice Ball in their Move List, they do not become Slowed while Curled Up. Furthermore, when using the Moves Rollout or Ice Ball while Curled Up, the user gains a +10 bonus to the damage rolls of those Moves and does not suffer Accuracy Penalties from being Curled Up.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "At-Will";
		range = "Self";
		type = "Normal";
		category = "Status";
	}
	public Defense_Curl(){}
}