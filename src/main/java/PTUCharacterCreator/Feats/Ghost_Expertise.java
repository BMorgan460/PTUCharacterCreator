package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Ghost_Expertise extends Feature {
	{
		name = "Ghost Expertise";
		tags = "[Ranked 2][+Any]";
		frequency = "Static";
		effect = "You gain STAB for Ghost. STAB is never applied to Struggle Attacks.";
		prereqs.put("Level 9", -2);
		prereqs.put("3 Moves of the Chosen Type in your Move List", 0);
	}
	public Ghost_Expertise(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.aboveLevel(9);
	}
}