package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Command_Versatility extends Feature {
	{
		name = "Command Versatility";
		tags = "";
		frequency = "1 AP - Free Action";
		effect = "Trigger: Your Pokemon takes its turn. Effect: Your Pokemon may give up use of a Scene or Daily Move to regain use of a Scene or Daily Move which it has already used. Your Pokemon may give up use of a Daily Move to regain use of a Scene Move, but not vice-versa. You may use Command Versatility only once per Scene per Pokemon.";
		prereqs.put("Command", 4);
	}
	public Command_Versatility(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Command",4);
	}
}