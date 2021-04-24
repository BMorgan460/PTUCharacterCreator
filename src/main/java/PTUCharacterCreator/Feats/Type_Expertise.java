package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Type_Expertise extends Feature {
	{
		name = "Type Expertise";
		tags = "[Ranked 2][+Any]";
		frequency = "Static";
		effect = "Each Rank, choose a Type of which you know at least 3 Moves. You gain STAB for the chosen Type. STAB is never applied to Struggle Attacks.";
		prereqs.put("Level 9", -2);
		prereqs.put("3 Moves of the Chosen Type in your Move List", 0);
	}
	public Type_Expertise(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.aboveLevel(9);
	}
}