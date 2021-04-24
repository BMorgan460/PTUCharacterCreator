package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Fighters_Versatility extends Feature {
	{
		name = "Fighter's Versatility";
		tags = "[+Any]";
		frequency = "Scene - Free Action";
		effect = "Trigger: You gain Initiative. Effect: You may give up use of a Scene or Daily Move to regain use of a Scene or Daily Move which you have already used. You may give up use of a Daily Move to regain use of a Scene Move, but not vice-versa.";
		prereqs.put("Learned two Scene or Daily Moves", 0);
	}
	public Fighters_Versatility(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return true;
	}
}