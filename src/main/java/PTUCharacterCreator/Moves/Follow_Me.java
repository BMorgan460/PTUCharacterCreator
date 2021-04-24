package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Follow_Me extends Move {
	{
		name = "Follow Me";
		effect = "Until the end of the user's next turn, all Foes must target the user when using a Move that targets their opponents. This effect ends if the user is Fainted or Switched out.";
		damageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "Burst 5, Social";
		type = "Normal";
		category = "Status";
	}
	public Follow_Me(){}
}